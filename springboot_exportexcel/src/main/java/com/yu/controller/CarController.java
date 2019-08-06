package com.yu.controller;

import com.yu.utils.excel.ExportExcelUtil;
import com.yu.model.Car;
import com.yu.utils.ResponseUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2019/8/6.
 */
@RestController
@RequestMapping("/car")
public class CarController {

    @GetMapping("/export")
    public Object exportCar(HttpServletResponse response){
        //模拟数据库查询构建对象集合数据
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            carList.add(new Car(UUID.randomUUID().toString(), "audi" + i, "red",i+ Math.PI,false));
        }



        //执行导出操作
        //1.设置文件名
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String fileName = "car_" + dateFormat.format(new Date()) + ".xls";
        try {
            //2.设置相应头
            response.setContentType("application/vnd.ms-excel");
            response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8") + ".xls");
            //3.获取输出流
            ServletOutputStream outputStream = response.getOutputStream();
            //4.创建导出工具类，执行导出方法
            ExportExcelUtil<Car> exportExcelUtil = new ExportExcelUtil<>(carList, outputStream);
            exportExcelUtil.export();
        } catch (Exception e) {
            response.setContentType("application/json");
            response.setHeader("Content-Disposition","");
            e.printStackTrace();
            return ResponseUtil.commonResponse("failed","导出失败"+e.getMessage());
        }
        return null;
    }

}
