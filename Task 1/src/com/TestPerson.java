package com;

public class TestPerson {
    public static void main(String[] args) {
        Address storo = new Address("Storo 1", "1223", "Norway");
        Staff per = new Staff("Per", "Store", 40, storo, 40000);
        Person ole = new Student("Ole", "Hansen", 15);

        System.out.print(per.toString() + "\n");
        System.out.print(ole.toString() + "\n");

        System.out.print(String.valueOf(per.getSalary()) + "\n");

        per.setSalary(100000);
        System.out.print(String.valueOf(per.getPayment()) + "\n");


        /**  polymorfisme  **/
        //polymorfisme er muligheten for et objekt til å ta på seg mangen former.
        per.polymorfisme();
        ole.polymorfisme();
        // så det har den samme metoden men gjør forsjelige ting med denne metoden.


    }
}
