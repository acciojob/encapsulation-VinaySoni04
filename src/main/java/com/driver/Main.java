package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.name = "John"; // Error: name has private access in com.driver.RWOnly
        System.out.println(obj.name); // Error: name has private access in com.driver.RWOnly
        // Because we can't access the private member from outside the class

        obj.setName("Vinay Soni");
        System.out.println(obj.getName());
    }
}
