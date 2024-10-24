package com.subhani;

import java.util.Scanner;

public class greeting_ {
    static void greet(){
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        System.out.print("Enter the first number= ");
        i = sc.nextInt();
        System.out.print("Enter the second number= ");
        j = sc.nextInt();
        System.out.print("Enter the third number= ");
        k = sc.nextInt();
        if(i <= j || i >= k || j == k){
            System.out.println("Hello!");
        }else if(i >= j || i == k || j <= k){
            System.out.println("Hi!");
        }else if(i == j || i <= k || j >= k){
            System.out.println("Good Morning!");

        }
    }
    public static void main(String [] args){
        greet();
    }
}
