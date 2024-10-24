package com.subhani;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // type casting
//        int number = (int)(input.nextFloat());
//        System.out.println(number);

        // automatic type promotion in expression
//         byte a = 50;
//         byte b = 60;
//         byte c = 100;
//         int d = a * b / c;
//         System.out.println(d);
//        int number = 'A';
//        System.out.println(number);
        byte a = 30;
        int b = 40;
        char c = 'A';
        float d = 50.23f;
        short e = 20;
        double f = 0.23654;
        double g = (d - a) + (b / c) - (f * e);
        System.out.println(g);
        System.out.println((d - a) + " " + (b / c) + " " + (f * e));
    }
}
