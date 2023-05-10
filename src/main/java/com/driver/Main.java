package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.name = "John"; // Error: The field RWOnly.name is not accessible
        System.out.println(obj.name); // Error: The field RWOnly.name is not accessible
        // Because we can't access private member from outside the class

        // Setting and Getting the name using setter and getter function
        obj.setName("Vinay");
        System.out.println(obj.getName());
    }
}