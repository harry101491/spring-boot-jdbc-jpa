package com.harshit.jdbcJpaDemo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.harshit.jdbcJpaDemo.entity.Person;

import org.springframework.stereotype.Repository;

@Repository()
@Transactional()
public class PersonJpaRepository {
    
    /**
     * Entity Manger is the interface for the persistance context; context manages the entities in the
     * current session.
     */
    @PersistenceContext()
    EntityManager entityManager;

    /**
     * finding the Person by given Id
     */
    public Person findById(int id) {
        return this.entityManager.find(Person.class, id);
    }
}