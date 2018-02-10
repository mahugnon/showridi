package com.showridi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.showridi.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
