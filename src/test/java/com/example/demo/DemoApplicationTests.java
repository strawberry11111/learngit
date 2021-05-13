package com.example.demo;

import com.example.demo.Dao.PersonDao;
import com.example.demo.Model.Person;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan({"com.example.demo.Dao"})
class DemoApplicationTests {

    @Autowired
    PersonDao personDao;

    @Test
    void contextLoads() {
        System.out.println(personDao.getOnePerson(2).getName().toString());
    }



}
