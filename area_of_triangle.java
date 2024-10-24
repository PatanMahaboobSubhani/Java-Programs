package com.subhani;
import java.util.Scanner;
public class area_of_triangle {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of the triangle: ");
        int l = s.nextInt();
        System.out.print("Enter breadth of the triangle: ");
        int b = s.nextInt();
        double area = 0.5 * l * b;
        System.out.println("Area of triangle is " + area);
    }
}
