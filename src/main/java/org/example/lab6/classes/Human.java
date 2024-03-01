package org.example.lab6.classes;

import java.util.Objects;

public class Human {
    private String secondName;
    private String firstName;
    private String surname;
    private int age;

    public Human(){
        this.firstName = "Дима";
        this.secondName = "Димасович";
        this.surname = "Дмитриевич";
        this.age = 18;
    }
    public Human(String secondName, String firstName, String surname, int age) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(secondName, human.secondName)
                && Objects.equals(firstName, human.firstName)
                    && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secondName, firstName, surname, age);
    }

    @Override
    public String toString() {
        return "Human{" +
                "secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
