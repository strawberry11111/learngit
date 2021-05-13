package com.example.demo.Service;

import com.example.demo.Model.Person;


import java.util.List;

public interface PersonService {

    List<Person> getAllPerson();
    Person getOnePerson(Integer id);
    int insertPerson(Person person);
}
