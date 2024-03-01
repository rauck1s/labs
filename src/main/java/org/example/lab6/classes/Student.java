package org.example.lab6.classes;

import org.example.lab6.classes.Human;

public class Student extends Human {
    private String faculty;
    public Student(String secondName, String firstName, String surname, int age, String faculty) {
        super(secondName, firstName, surname, age);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}