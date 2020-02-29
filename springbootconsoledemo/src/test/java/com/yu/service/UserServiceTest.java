package com.yu.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2020/2/29.
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Value("#{'${user.ids}'.split(',')}")
    private List<Integer> ids;

    @Test
    public void showAllUsers() throws Exception {
        userService.showAllUsers();
    }

    @Test
    public void showOneUserById() throws Exception {
        userService.showOneUserById(4446);

    }
    @Test
    public void queryFromConfig(){
        userService.queryFromConfig(ids);
    }
}