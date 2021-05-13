package com.example.demo.Service.impl;

import com.example.demo.Dao.PersonDao;
import com.example.demo.Model.Person;
import com.example.demo.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDao personDao;
    @Override
    public List<Person> getAllPerson() {
        return personDao.getAllPerson();
    }

    @Override
    public Person getOnePerson(Integer id){
        return personDao.getOnePerson(id);
    }

    @Override
    public int insertPerson(Person person) {

        return personDao.insertPerson(person);
    }
}
