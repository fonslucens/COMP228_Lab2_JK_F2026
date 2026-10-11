package com.jk.week5.lab3;

public class Person {
    private int personId;
    private String name;
    private int age;

    public Person(int personId, String name, int age) {
        this.personId = personId;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void performDuties() {
        System.out.println(name + " is performing general hospital duties.");
    }

    @Override
    public String toString() {
        return "Person ID: " + personId
                + "\nName: " + name
                + "\nAge: " + age;
    }
}