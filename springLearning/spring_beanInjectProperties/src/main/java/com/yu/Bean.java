package com.yu;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Administrator on 2019/7/11.
 */
public class Bean {

    private AnotherBean anotherBean;
    private String string;
    private String string1;
    private AnotherBean anotherBean1;

    private List<String> stringList;
    private List<AnotherBean> anotherBeanList;

    private Set<String> stringSet;
    private Set<AnotherBean> anotherBeanSet;

    private Map<String,String> stringMap;
    private Map<AnotherBean,AnotherBean> anotherBeanMap;

    private Properties properties;


    //注入空值
    private AnotherBean anotherBean2;

    @Override
    public String toString() {
        return "Bean{" +
                "anotherBean=" + anotherBean +
                ", string='" + string + '\'' +
                ", string1='" + string1 + '\'' +
                ", anotherBean1=" + anotherBean1 +
                ", stringList=" + stringList +
                ", anotherBeanList=" + anotherBeanList +
                ", stringSet=" + stringSet +
                ", anotherBeanSet=" + anotherBeanSet +
                ", stringMap=" + stringMap +
                ", anotherBeanMap=" + anotherBeanMap +
                ", properties=" + properties +
                ", anotherBean2=" + anotherBean2 +
                '}';
    }

    public AnotherBean getAnotherBean2() {
        return anotherBean2;
    }

    public void setAnotherBean2(AnotherBean anotherBean2) {
        this.anotherBean2 = anotherBean2;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public List<AnotherBean> getAnotherBeanList() {
        return anotherBeanList;
    }

    public void setAnotherBeanList(List<AnotherBean> anotherBeanList) {
        this.anotherBeanList = anotherBeanList;
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public Set<AnotherBean> getAnotherBeanSet() {
        return anotherBeanSet;
    }

    public void setAnotherBeanSet(Set<AnotherBean> anotherBeanSet) {
        this.anotherBeanSet = anotherBeanSet;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    public Map<AnotherBean, AnotherBean> getAnotherBeanMap() {
        return anotherBeanMap;
    }

    public void setAnotherBeanMap(Map<AnotherBean, AnotherBean> anotherBeanMap) {
        this.anotherBeanMap = anotherBeanMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public AnotherBean getAnotherBean1() {
        return anotherBean1;
    }

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public void setAnotherBean1(AnotherBean anotherBean1) {
        this.anotherBean1 = anotherBean1;
    }

    public Bean(AnotherBean anotherBean, String string) {
        this.anotherBean = anotherBean;
        this.string = string;
    }

    public AnotherBean getAnotherBean() {
        return anotherBean;
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
