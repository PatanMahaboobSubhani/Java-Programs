package com.subhani;

import java.util.Scanner;

public class switch_case {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car brand name: ");
        String car = sc.nextLine();
        switch (car) {
            case "BMW" -> System.out.println("BMW is a German car brand");
            case "Audi" -> System.out.println("Audi is a German car brand");
            case "Mercedes" -> System.out.println("Mercedes is a German car brand");
            case "Toyota" -> System.out.println("Toyota is a Japanese car brand");
            case "Honda" -> System.out.println("Honda is a Japanese car brand");
            case "Suzuki" -> System.out.println("Suzuki is a Japanese car brand");
            default -> System.out.println("Car brand not found");
        }
    }
}
