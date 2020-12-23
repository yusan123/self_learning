package com.yu.test.mapper;

import com.yu.test.domain.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author yu
 * @DateTime 2020/12/23 20:40
 */
@Mapper
public interface PersonMapper {

    List<Person> getAll();

    void add(Person person);
}
