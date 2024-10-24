package com.subhani;

import java.util.Scanner;

public class sums {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the first sum value= ");
        int sum1 = input.nextInt();
        System.out.print("Enter the second sum value= ");
        int sum2 = input.nextInt();
        int result = sum1 + sum2;
        System.out.println(result + " is the sum of two values.");
    }
}
