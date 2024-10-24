package com.subhani;
import java.util.Scanner;
public class notprime {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j;
        int count = 0;
        for (j = 1; j <= i; j++){
            if (i % j == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println(i + " is prime bro");
        }
        else{
            System.out.println(i + " is not prime bro");
        }
    }
}
