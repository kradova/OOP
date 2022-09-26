package com.kradova.objectorienteddemo;

public class Staff {

    private String nameOfStaff;
    private final int hourlyRate = 30;
    public int hoursWorked;

    public void printMessage() {
        System.out.println("Calculating Pay...");
        System.out.println(this.hoursWorked);
    }

    public int calculatePay() {
        printMessage();
        int staffPay;
        staffPay = hoursWorked * hourlyRate;
        if (hoursWorked > 0) {
            return staffPay;
        } else {
            return -1;
        }
    }
}// Staff
