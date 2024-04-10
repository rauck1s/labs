package org.example.lab6.classes;

import org.example.lab6.classes.Human;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), faculty);
    }
}
