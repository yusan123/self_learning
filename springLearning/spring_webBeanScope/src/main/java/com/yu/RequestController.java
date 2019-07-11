package com.yu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2019/7/11.
 */
@Controller
public class RequestController {

    @GetMapping("/request")
    @ResponseBody
    public Object testRequest(){
        return this.toString();
    }
}
