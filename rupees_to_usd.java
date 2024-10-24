package com.subhani;

import java.util.Scanner;

public class rupees_to_usd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in rupees: ");
        float rupees = sc.nextFloat();
        float usd = rupees * 0.012f;
        System.out.println("the amount of " + rupees + " rupees in USD is " + usd);
    }
}
