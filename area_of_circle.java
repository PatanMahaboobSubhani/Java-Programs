package com.subhani;

import java.util.Scanner;

public class area_of_circle {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = s.nextInt();
        double area = 3.14 * r * r;
        System.out.println("Area of circle is " + area);
    }
}
