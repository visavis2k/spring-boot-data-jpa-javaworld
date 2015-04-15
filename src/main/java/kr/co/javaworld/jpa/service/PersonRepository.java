package kr.co.javaworld.jpa.service;

import kr.co.javaworld.jpa.domain.Car;
import kr.co.javaworld.jpa.domain.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

interface PersonRepository extends Repository<Person, Long> {

    Person findOne(Long id);

    List<Person> findByName(String name);

    Person save(Person person);

}
