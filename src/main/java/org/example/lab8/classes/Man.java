package org.example.lab8.classes;

public class Man extends Human{
    private String name;
    private int age;
    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Man(){
        this.name  = "default";
        this.age = 0;
    }
    private boolean testFunctions(){
        return true;
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
}
