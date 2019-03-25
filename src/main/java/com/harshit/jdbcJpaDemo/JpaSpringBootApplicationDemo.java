package com.harshit.jdbcJpaDemo;


import java.util.Date;

import com.harshit.jdbcJpaDemo.entity.Person;
import com.harshit.jdbcJpaDemo.jdbc.PersonJdbcDAO;
import com.harshit.jdbcJpaDemo.jpa.PersonJpaRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaSpringBootApplicationDemo implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(JpaSpringBootApplicationDemo.class);

    @Autowired
    PersonJpaRepository resJpaRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaSpringBootApplicationDemo.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        this.logger.info("User for 10002 -> {}", this.resJpaRepository.findById(10002));
		// this.logger.info("All Persons -> {}", this.personDao.getAllPersons());
		// this.logger.info("User for 10002 -> {}", this.personDao.getPersonById(10002));
		// this.logger.info("User for 10003 -> {}", this.personDao.deletePersonById(10003));
	}

}
