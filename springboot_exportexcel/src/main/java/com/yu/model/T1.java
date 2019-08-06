package com.yu.model;

import com.yu.utils.excel.ExportExcelUtil;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Administrator on 2019/8/3.
 */
public class T1 {

    public static void main(String[] args) throws Exception {

        ArrayList<Person> personList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            personList.add(new Person(i+1,"lisi"+i,"110","陕西宝鸡","success",111));
        }


        //System.out.println(personList);
        String[] rowName = new String[]{"编号","姓名","手机号","地址","考核结果"};
        FileOutputStream os = new FileOutputStream("person"+new Date().getTime()+".xls");
        ExportExcelUtil<Person> exportExcelUtil = new ExportExcelUtil<Person>(personList,os);
        exportExcelUtil.export();
    }
}
