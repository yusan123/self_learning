package com.yu.utils;

import java.util.HashMap;

/**
 * Created by Administrator on 2019/8/6.
 */
public class ResponseUtil {


    public static HashMap<String,Object> commonResponse(String status,String msg){
        HashMap<String , Object> result = new HashMap<>();
        result.put("status",status);
        result.put("msg",msg);
        return result;
    }
}
