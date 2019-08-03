package com.yu.controller;

import com.yu.excel.ExportExcel2;
import com.yu.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2019/8/3.
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    //@Autowired
    //public HttpServletResponse response;

    @GetMapping("/export")
    public Object exportToExcel(HttpServletResponse response) {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            personList.add(new Person(i + 1, "lisi" + i, "110", "陕西宝鸡", "success"));
        }

        HashMap<String, Object> result = new HashMap<>();
        try {
            String[] rowName = new String[]{"编号", "姓名", "手机号", "地址", "考核结果"};
            String fileName = "导出" + new Date().getTime() + ".xls";
            //String headStr = "attachment; filename=\"" + fileName + "\"";
            //response.setHeader("Content-Disposition", headStr);
            //response.setContentType("APPLICATION/OCTET-STREAM");

            response.setContentType("application/vnd.ms-excel");
            response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8") + ".xls");

            ServletOutputStream outputStream = response.getOutputStream();
            ExportExcel2<Person> exportExcel2 = new ExportExcel2<>("person", rowName, personList, outputStream);
            exportExcel2.export();
        } catch (Exception e) {
            e.printStackTrace();
            result.put("status", "error");
            result.put("msg", "导出失败" + e.getMessage());
            return result;
        }
        result.put("status", "success");
        result.put("msg", "导出成功");
        return result;
    }

}
