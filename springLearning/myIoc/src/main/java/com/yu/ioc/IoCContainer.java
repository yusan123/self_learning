package com.yu.ioc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2019/7/11.
 */
public class IoCContainer {

    private Map<String,Object> beans = new ConcurrentHashMap<String,Object>();

    /**
     * 1.获取bean
     * 2.初始化bean
     */

    /**
     * 根据beanId从ioc容器中获取一个bean
     * @param beanId
     * @return
     */
    public Object getBean(String beanId){
        return beans.get(beanId);
    }

    public void createBean(Class<?> clazz,String beanId,String... paramBeans){
        //1.组装bean的参数
        Object[] paramValue = new Object[paramBeans.length];
        for (int i = 0; i < paramBeans.length; i++) {
            paramValue[i]=beans.get(paramBeans[i]);
        }
        //2.创建bean实例
        Constructor<?>[] constructors = clazz.getConstructors();
        Object bean = null;
        for (Constructor<?> constructor : constructors) {
            try {
                bean = constructor.newInstance(paramValue);
            } catch (InstantiationException e) {
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e) {
            }
        }
        if (bean == null){
            throw new RuntimeException("没有合适的构造方法，创建实例失败！");
        }

        //3.将bean存入容器
        beans.put(beanId,bean);
    }

}
