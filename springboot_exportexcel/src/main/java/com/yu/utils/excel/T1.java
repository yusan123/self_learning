package com.yu.utils.excel;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Administrator on 2019/8/2.
 */
public class T1 {
    public static void main(String[] args) throws Exception {

        ArrayList<Object[]> objects = new ArrayList<>();

        String[] rowName = new String[]{"编号", "姓名", "年龄", "家庭住址"};

        for (int i = 0; i < 10; i++) {
            Object[] obj = new Object[rowName.length];
            obj[0] = i + 1;
            obj[1] = "张三" + i;
            obj[2] = new Random().nextInt(80);
            obj[3] = "北京" + i;

            objects.add(obj);
        }

        ExportExcel exportExcel = new ExportExcel("info",rowName,objects);
        exportExcel.export();

    }
}
