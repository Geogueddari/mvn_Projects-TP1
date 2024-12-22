package com.Elgaddari;

public class Personne {
    String name;
    int age;

    public Personne() {

    }

    public Personne(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String displayInfos() {
        return "Name : " + name + " , Age : " + age;
    }
}