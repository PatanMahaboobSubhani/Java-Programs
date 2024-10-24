package com.subhani;

import java.util.Scanner;

public class sum_function {
    static void num(){
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number= ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number= ");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.print("Here is the sum value: " + sum);
    }
    static int num1(){
        int num3, num4, diff;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number for num1= ");
        num3 = sc.nextInt();
        System.out.print("Enter the second number for num1= ");
        num4 = sc.nextInt();
        diff = num3 - num4;
        return diff;

    }
    public static void main(String [] args){
        int s = num1();
        System.out.println("Here is the diff value: " + s);
        num();
    }
}
