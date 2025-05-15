package com.viriq.springboot.jpa.springboot_jpa.repositories;

import com.viriq.springboot.jpa.springboot_jpa.entities.Person;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findByLanguages(String languages);

}
