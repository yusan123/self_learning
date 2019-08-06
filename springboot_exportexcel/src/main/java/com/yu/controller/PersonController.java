package com.yu.controller;

import com.yu.utils.excel.ExportExcelUtil;
import com.yu.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.*;

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
            personList.add(new Person(i + 1, "lisi" + i, "110", "陕西宝鸡", "success",Integer.valueOf(88*i)));
        }

        HashMap<String, Object> result = new HashMap<>();
        try {
            //String[] rowName = new String[]{"id", "name", "phoneNum", "address", "outcome"};
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            String fileName = "person_" + dateFormat.format(new Date()) + ".xls";
            response.setContentType("application/vnd.ms-excel");
            response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8") + ".xls");
            ServletOutputStream outputStream = response.getOutputStream();
            ExportExcelUtil<Person> exportExcelUtil = new ExportExcelUtil<>(personList, outputStream);
            //测试listObject 为空
            //ExportExcelUtil<Person> exportExcelUtil = new ExportExcelUtil<>("person", Collections.emptyList(), outputStream);
            //ExportExcelUtil<Person> exportExcelUtil = new ExportExcelUtil<>("person", rowName, personList, outputStream);
            //System.out.println(1/0);
            exportExcelUtil.export();
        } catch (Exception e) {
            response.setContentType("application/json");
            response.setHeader("Content-Disposition","");
            e.printStackTrace();
            result.put("status", "error");
            result.put("msg", "导出失败" + e.getMessage());
            return result;
        }
        return null;
    }

}
