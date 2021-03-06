package com.example.profile.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class Profile {
    @JsonProperty
    private String name;
    @JsonProperty
    private String lastName;
    @JsonProperty
    private int age;
    @JsonProperty
    private int password;
    @JsonProperty
    private LocalDate dateOfBirth;

    public Profile(){

    }

    public Profile(String name, String lastName, int age, int password, LocalDate dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
