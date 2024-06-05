package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly obj=new RWOnly();
        obj.setName("ramya");
        String retrieveName= obj.getName();
        System.out.println(retrieveName);
    }
}