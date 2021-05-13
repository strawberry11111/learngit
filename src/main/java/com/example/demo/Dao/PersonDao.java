package com.example.demo.Dao;

import com.example.demo.Model.Person;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDao {
    List<Person> getAllPerson();
    Person getOnePerson(@Param(value = "id") Integer id);
    int insertPerson(@Param(value = "person") Person person);
}
