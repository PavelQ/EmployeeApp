package ru.qupol.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Pavel on 22.09.2014.
 * <p>
 * Main the Employee entity
 */
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "second_name")
    private String secondName;
    private Byte age;
    private Integer experience;
    private String description;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String secondName, Byte age, Integer experience, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.age = age;
        this.experience = experience;
        this.description = description;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return getId() + getFirstName() + getSecondName() + getLastName() + getExperience() + getDescription() + getAge();
    }
}
