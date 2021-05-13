package com.example.demo.Controller;

import com.example.demo.Model.Person;
import com.example.demo.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class PersonController {

    @Autowired
    PersonService personService;
    @GetMapping("/AllPeople")
    public List<Person> PersonInfo(){
        return personService.getAllPerson();
    }

    @GetMapping("/OnePersonInfo")
    public Person OnePersonInfo(@RequestParam(value = "id") Integer id) {
        final Person onePerson = personService.getOnePerson(id);
        return onePerson;
    }

    @GetMapping("/InsertPerson")
    public String InsertPerson(@RequestParam(value = "name") String name,
                             @RequestParam(value = "age") Integer age){
        Person person = new Person(0, name, age);
        personService.insertPerson(person);
        return "Insert Successfully";

    }
}
