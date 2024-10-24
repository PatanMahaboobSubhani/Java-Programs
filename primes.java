package com.subhani;
import java.util.Scanner;
public class primes {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int i;
        int count = 0;
        for (i = 1; i <= b; i++){
            if (b % i ==0) {
                count++;
            }
        }
        if(count==2){
            System.out.println(b + " is prime");
        }
        else{
            System.out.println(b + " is not prime");
        }
    }
}
