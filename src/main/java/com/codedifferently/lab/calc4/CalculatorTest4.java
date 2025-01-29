package com.codedifferently.lab.calc4;

public class CalculatorTest4 {
    public static void main(String[] args) {

        Calculator4 calc = new Calculator4();

        //Name your friends
        calc.findTotal(10, "Noah");
        calc.findTotal(12, "Ryan");
        calc.findTotal(9,  "Chase");
        calc.findTotal(8,  "Dale");
        calc.findTotal(7,  "Justin");
        calc.findTotal(15, "Alex");
        calc.findTotal(11, "Denny");
        calc.findTotal(30, "Forgetful");

        //Find and print the entire table's total, including tax and tip

        calc.printTableTotal(); 

    }
}
