package com;

public abstract class Person {

    private String firstName;
    private String lastName;
    private int age;
    private Address address;


    public Person(String firstName, String lastName, int age, double salary) {
        this("default firstName", "default lastName" );
    }

    public Person(String firstName, String lastName) {
        this(firstName,lastName,0);
    }

    public Person(String firstName, String lastName, int age) {
        this(firstName,lastName,age,null );
    }

    public Person(String firstName, String lastName, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }


    public void polymorfisme() {
        System.out.print("person\n");
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public Address getAddress() {
        return address;
    }


    public abstract String toString();

}
