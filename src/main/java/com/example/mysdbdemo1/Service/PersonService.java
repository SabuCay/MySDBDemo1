package com.example.mysdbdemo1.Service;

import com.example.mysdbdemo1.Model.Person;
import com.example.mysdbdemo1.Repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepo personRepo;

    public List<Person> fetchAll(){
       return personRepo.fetchAll();
    }

    public void addPerson(Person person){
        personRepo.AddPerson(person);
    }

    public Person findPersonById(int id){
        return personRepo.findPersonById(id);
    }

    public Boolean deletePerson(int id){
        return personRepo.deletePerson(id);
    }

    public void updatePerson(Person person){
        personRepo.updatePerson(person);
    }
}
