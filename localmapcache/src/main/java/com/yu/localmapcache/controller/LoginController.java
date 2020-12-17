package com.yu.localmapcache.controller;

import com.yu.localmapcache.constant.LocalCache;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yu
 * @DateTime 2020/12/17 22:21
 */
@RestController
public class LoginController {

    @GetMapping("/cache")
    public Object look(){
        return LocalCache.cache;
    }


}
