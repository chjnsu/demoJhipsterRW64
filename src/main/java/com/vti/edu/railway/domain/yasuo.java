package com.vti.edu.railway.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "yasuo")
public class yasuo implements Serializable {

    private static final long serialVersionUID = 1998;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
     String name;

    @Column(name = "age")
     int age;

    @Column(name = "salary")
     double salary;

    @Column(name = "is_active")
     boolean isActive;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date")
    Date birthDate;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
     Gender gender;

    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
