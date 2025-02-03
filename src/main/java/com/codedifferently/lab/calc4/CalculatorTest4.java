package com.codedifferently.lab.calc4;

public class CalculatorTest4 {
    public static void main(String[] args) {

        Calculator4 calc = new Calculator4();

        //Name your friends
        calc.findTotal(18, "Noah");
        calc.findTotal(20, "Ryan");
        calc.findTotal(16,  "Chase");
        calc.findTotal(15,  "Dale");
        calc.findTotal(14,  "Justin");
        calc.findTotal(19, "Denny");


        //Find and print the entire table's total, including tax and tip

        calc.printTableTotal(); 

    }
}
