package com.subhani;
import java.util.Scanner;
public class operators_using_ifcondition {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        if (a <= b){
            int c = a + b;
            System.out.println("Total sum = " + c);
        }
        else{
            int c = a - b;
            System.out.println("Total difference = " + c);
        }
    }
}
