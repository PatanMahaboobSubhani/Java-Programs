package com.subhani;

import java.util.Scanner;

public class int_num_ {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        int i = 1;
        while(i <= num){
            int num1 = num + i;
            System.out.println(num1);
            if(num == 0){
                break;
            }
            i++;
        }
    }
}
