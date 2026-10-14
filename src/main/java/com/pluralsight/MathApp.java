package com.pluralsight;



public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        double bobSalary = 10.000;
        double garySalary = 11.000;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        // Question 2:

        double carPrice = 5.00;
        double truckPrice = 2.00;

        double smallest = Math.min(carPrice, truckPrice);
        System.out.println("The " + smallest + " is the smallest.");


    }







}
