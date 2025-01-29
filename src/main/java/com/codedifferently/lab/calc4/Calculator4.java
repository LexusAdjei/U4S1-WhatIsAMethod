package com.codedifferently.lab.calc4;

public class Calculator4 {
    public double tax = .05;
    public double tip = .15;
    public double tableTotal = 0;


    //Include the cost of Alex's and Forgetful's meals in your calculations
    //Return the total after calculating
    public void findTotal(double price, String name) {
        double total = price * (1 + tax + tip);
        System.out.println(name + ": $" + total);

        tableTotal += total;
    }
        public void printTableTotal() {
            System.out.println("Total bill for the table: $" + tableTotal);
        }
    }

