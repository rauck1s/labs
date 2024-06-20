package org.example.lab9;

import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private String lastname;
    private int age;
    public enum Gender{
        MAN,
        WOMAN

    }
    private Gender gender;

    public Human(String name, String surname, String lastname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(lastname, human.lastname) && gender == human.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, lastname, age, gender);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
