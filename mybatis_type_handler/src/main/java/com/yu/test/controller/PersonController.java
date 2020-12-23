package com.yu.test.controller;

import com.yu.test.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yu
 * @DateTime 2020/12/23 20:50
 */
@RestController
public class PersonController {

    @Autowired
    private PersonMapper personMapper;

    @GetMapping("/")
    public Object getAll(){
        return personMapper.getAll();
    }
}
