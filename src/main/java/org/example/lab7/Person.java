package org.example.lab7;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private String lastname;
    private int dataOfBirth;

    public Person(String name, String surname, String lastname, int dataOfBirth) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.dataOfBirth = dataOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(int dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return dataOfBirth == person.dataOfBirth && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, lastname, dataOfBirth);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dataOfBirth=" + dataOfBirth +
                '}';
    }
}
