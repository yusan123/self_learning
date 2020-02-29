package com.yu.dao;

import com.yu.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2020/2/29.
 */
@Mapper
@Repository
public interface UserMapper {

    List<User> queryAll();

    User getUserById(@Param("id") Integer id);

    List<User> getUsersByIds(@Param("ids") List<Integer> ids);
}
