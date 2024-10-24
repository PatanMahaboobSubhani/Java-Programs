package com.subhani;

import java.util.Scanner;

public class even_odd_problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
//        if (a % 2 == 0){
//            System.out.print(a + " is an even number.");
//            }
//        else{
//            System.out.print(a + " is an odd number.");
//        }
        if (a % 2 != 0){
            System.out.print(a + " is an odd number.");
        }
        else{
            System.out.print(a + " is an even number.");
        }
    }
}
