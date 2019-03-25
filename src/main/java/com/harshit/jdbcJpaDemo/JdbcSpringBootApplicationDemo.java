package com.harshit.jdbcJpaDemo;


import java.util.Date;

import com.harshit.jdbcJpaDemo.entity.Person;
import com.harshit.jdbcJpaDemo.jdbc.PersonJdbcDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
public class JdbcSpringBootApplicationDemo implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(JdbcSpringBootApplicationDemo.class);

	@Autowired
	PersonJdbcDAO personDao;

	public static void main(String[] args) {
		SpringApplication.run(JdbcSpringBootApplicationDemo.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.logger.info("All Persons -> {}", this.personDao.getAllPersons());
		this.logger.info("User for 10002 -> {}", this.personDao.getPersonById(10002));
		// this.logger.info("User for 10003 -> {}", this.personDao.deletePersonById(10003));
		// this.logger.info("Person inserted for 10008 -> {}", this.personDao.insertPerson(new Person(10008, "Kritika Pareek", "Jaipur", new Date())));
		this.logger.info("Person inserted for 10001 -> {}", this.personDao.updatePerson(new Person(10001, "Sanjeev", "Cerritos", new Date())));
	}

}
