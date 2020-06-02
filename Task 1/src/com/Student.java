package com;

public class Student extends Person {
    public Student() {
        this("default firstName", "default lastName");
    }

    public Student(String firstName, String lastName) {
        super(firstName, lastName, 0);
    }

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public void polymorfisme() {
        System.out.print("student\n");
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " " + this.getAge();
    }
}
