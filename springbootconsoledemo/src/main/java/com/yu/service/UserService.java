package com.yu.service;

import com.yu.dao.UserMapper;
import com.yu.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2020/2/29.
 */
@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserMapper userMapper;

    @Value("#{'${user.ids}'.split(',')}")
    private List<Integer> ids;

    public void showAllUsers() {
        logger.info("begin query to database get all users");
        List<User> users = userMapper.queryAll();
        logger.info("begin show all user info");
        users.forEach(System.out::println);
    }

    public void showOneUserById(Integer id){
        User userById = userMapper.getUserById(id);
        logger.warn("query user by id:" + id + " result is " + userById);
        System.out.println(userById);
    }

    public void queryFromConfig(List<Integer> ids) {
        logger.info("begin query from config ids is" + ids);
        List<User> usersByIds = userMapper.getUsersByIds(ids);
        usersByIds.forEach(System.out::println);
    }
}
