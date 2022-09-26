package com.kradova.objectorienteddemo;

public class ObjectOrientedDemo {

    public static void main(String[] args) {
      //  System.out.println("Hello World!");
        Staff a = new Staff();
        System.out.println(a.hoursWorked);
        
        a.hoursWorked = 10;
        
        int result = a.calculatePay();
        System.out.println(result); 
    }// main
}
