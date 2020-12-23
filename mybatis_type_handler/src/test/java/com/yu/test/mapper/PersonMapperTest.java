package com.yu.test.mapper;

import com.yu.test.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;


/**
 * @Author yu
 * @DateTime 2020/12/23 20:55
 */
@SpringBootTest
public class PersonMapperTest {

    @Autowired
    private PersonMapper personMapper;

    @Test
    public void getAll() {
        List<Person> all = personMapper.getAll();
        System.out.println(all);
        System.out.println("11111111");
    }

    @Test
    public void add() {
        for (int i = 0; i < 5; i++) {
            personMapper.add(new Person(i+"","zs"+i, LocalDateTime.now().minusDays(i)));
        }

    }
}