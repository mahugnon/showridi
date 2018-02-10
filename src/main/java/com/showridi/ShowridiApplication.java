package com.showridi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.showridi.entities.Person;
import com.showridi.repository.PersonRepository;

@SpringBootApplication
public class ShowridiApplication implements CommandLineRunner {
	@Autowired
	PersonRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ShowridiApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		repository.save(new Person("Anicet Trid"));
		repository.findAll().forEach(p->{
			System.out.println(p.toString());
		});
	}
}
