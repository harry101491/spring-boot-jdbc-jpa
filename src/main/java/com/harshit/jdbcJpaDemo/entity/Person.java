package com.harshit.jdbcJpaDemo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "person")
public class Person {
    
    @GeneratedValue()
    @Column(name = "id")
    @Id()
    private int id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "location")
    private String location;
    
    @Column(name = "birth_date")
    private Date birthDate;

    public Person() {
        super();
    }

    public Person(String name, String location, Date birthDate) {
        super();
        this.location = location;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Person(int id, String name, String location, Date birthDate) {
        super();
        this.id = id;
        this.location = location;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getId() {
      return this.id;  
    }

    public String getName() {
        return this.name;  
    }

    public String getLocation() {
        return this.location;  
    }

    public Date getDateOfBirth() {
        return this.birthDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String toString() {
        return String.format("\n Person [id=%s, name=%s, location=%s, date_of_Birth=%s]", id, name, location, birthDate);
    }
}