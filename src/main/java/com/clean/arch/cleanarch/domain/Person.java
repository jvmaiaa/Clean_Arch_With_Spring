package com.clean.arch.cleanarch.domain;

import java.util.Objects;

public class Person {

    private Long id;

    private String name;

    private Long age;

    private String email;

    public Person() {}

    public Person(Long id, String name, Long age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        if (email != null && !email.contains("@") && !email.contains(".")) {
            throw new IllegalArgumentException("E-mail deve ter o formato correto");
        }
        this.email = email;
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

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
