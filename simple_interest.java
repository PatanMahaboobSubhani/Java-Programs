package com.subhani;

import java.util.Scanner;

public class simple_interest {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Initial Principal Balance: ");
        float p = input.nextFloat();
        System.out.print("Enter the Annual Interest Rate: ");
        float r = input.nextFloat();
        System.out.print("Enter the Number of Years for the loan amount: ");
        float t = input.nextFloat();
        Float A = (p * r * t);
        System.out.print("The Simple Interest for the total amount is: " + A);
    }
}
