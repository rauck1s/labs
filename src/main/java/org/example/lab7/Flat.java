package org.example.lab7;

import java.util.List;
import java.util.Objects;

public class Flat {
    private int number;
    private int square;
    private List<Person> personInfo;

    public Flat(int number, int square, List<Person> personInfo) {
        this.number = number;
        this.square = square;
        this.personInfo = personInfo;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public List<Person> getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(List<Person> personInfo) {
        this.personInfo = personInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flat flat = (Flat) o;
        return number == flat.number && square == flat.square && Objects.equals(personInfo, flat.personInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, square, personInfo);
    }

    @Override
    public String toString() {
        return "Flat{" +
                "number=" + number +
                ", square=" + square +
                ", personInfo=" + personInfo +
                '}';
    }
}
