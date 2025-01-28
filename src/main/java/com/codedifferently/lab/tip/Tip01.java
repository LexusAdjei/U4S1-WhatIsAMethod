package com.codedifferently.lab.tip;

public class Tip01 {
    public static void main(String[] args) {

        double taxRate = 0.05;
        double tipRate = 0.15;

        double person1 = 10;
        double total1 = person1 * (1 + taxRate + tipRate);
        System.out.println("person1: $" + total1);

        double person2 = 12;
        double total2 = person2 * (1 + taxRate + tipRate);
        System.out.println("person2: $" + total2);

        double person3 = 9;
        double total3 = person3 * (1 + taxRate + tipRate);
        System.out.println("person3: $" + total3);

        double person4 = 8;
        double total4 = person4 * (1 + taxRate + tipRate);
        System.out.println("person4: $" + total4);

        double person5 = 7;
        double total5 = person5 * (1 + taxRate + tipRate);
        System.out.println("person5: $" + total5);

        double person6 = 15;
        double total6 = person6 * (1 + taxRate + tipRate);
        System.out.println("person6(Alex): $" + total6);

        double person7 = 11;
        double total7 = person7 * (1 + taxRate + tipRate);
        System.out.println("person7: $" + total7);

        double person8 = 30;
        double total8 = person8 * (1 + taxRate + tipRate);
        System.out.println("person8: $" + total8);


    }
}
