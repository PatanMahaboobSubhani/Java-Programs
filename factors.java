package com.subhani;

import java.util.Scanner;

public class factors {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int num = s.nextInt();
//        for(int i = 1; i <=num; i++){
//            if(num % i == 0){
//                System.out.print(i);
//            }
//        }
        int i = 1;
        while( i <= num){
            if(num % i == 0){
                System.out.print(i);
            };
            i++;
        }
    }
}
