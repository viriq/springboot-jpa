package com.viriq.springboot.jpa.springboot_jpa.repositories;

import com.viriq.springboot.jpa.springboot_jpa.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
