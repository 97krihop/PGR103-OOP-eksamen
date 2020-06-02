package com;

public class Staff extends Person implements Payable {
    private double salary;

    public Staff() {
        this("default firstName", "default lastName");
    }

    public Staff(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }

    public Staff(String firstName, String lastName, int age) {
        this(firstName, lastName, age, 0);
    }

    public Staff(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age, salary);
    }

    public Staff(String firstName, String lastName, int age, Address address, double salary) {
        super(firstName, lastName, age, address);
        this.salary = salary;
    }


    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void polymorfisme() {
        System.out.print("Staff\n");
    }

    @Override
    public String toString() {
        return this.getFirstName() + ", " + this.getLastName() + ", " + this.getAge() + ", " + this.getPayment() + ",\n" + this.getAddress();
    }

    @Override
    public double getPayment() {
        return this.salary * 12;
    }
}
