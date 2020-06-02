package com;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Character;

public class Program {
    private final ArrayList<String> arrayName = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public void run() {
        boolean n = false;
        boolean isWord = true;
        String a;
        do {
            System.out.print("enter name: \n");
            a = scanner.nextLine();
            if (a.equals(""))
                n = true;
            else if (a.length() >= 2) {
                for (int i = 0; i < a.length(); i++)
                    if (!Character.isLetter(a.charAt(i))) {
                        isWord = false;
                    }
                if (isWord) {
                    addName(a);
                } else
                    System.out.println("Names can only contain letters.");
                isWord = true;
            } else
                System.out.println("to short of a name.");
        } while (!n);
        scanner.close();

        System.out.println("\n*****************************\n");
        printName();
        System.out.println("\n");
        avgNumber();
        longestName();
    }

    public void addName(String name) {
        arrayName.add(name);
    }

    public void printName() {
        for (int i = 0; i < arrayName.size(); i++)
            System.out.print(i + 1 + ": " + arrayName.get(i) + "\n");
    }

    public void avgNumber() {
        double total = 0;
        for (String s : arrayName) {
            total += s.length();
        }
        System.out.print("Average number: " + total / arrayName.size() + "\n");
    }

    public void longestName() {
        String answer = "";
        for (String s : arrayName) {
            if (answer.length() < s.length()) {
                answer = s;
            }
        }
        System.out.println("LongestName: " + answer + "\n");
    }

}
