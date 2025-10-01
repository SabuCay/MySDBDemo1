package com.example.mysdbdemo1.Repository;

import com.example.mysdbdemo1.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepo {
    @Autowired
    JdbcTemplate template;

    public List<Person> fetchAll(){
        String sql = "SELECT * FROM person";
        RowMapper<Person> rowMapper = new BeanPropertyRowMapper<>(Person.class);
        return template.query(sql, rowMapper);
    }

    public void AddPerson(Person person){
        String sql = "INSERT INTO person (id, first_name, last_name) VALUES (?, ?, ?)";
        template.update(sql, person.getId(), person.getFirst_name(), person.getLast_name());
    }

    public Person findPersonById(int id){
        return null;
    }

    public Boolean deletePerson(int id){
        return null;
    }

    public void updatePerson(Person person){

    }
}
