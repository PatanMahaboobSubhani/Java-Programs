package com.subhani;

import java.util.Scanner;

public class Nexted_switch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        int student_id = sc.nextInt();
        switch(student_id) {
            case 201 -> {
                System.out.println("Student ID: 201");
                System.out.println("Student Name: Subhani Patan");
                System.out.println("Student Age: 22");
                System.out.println("Student Branch: IT");
                break;
            }
            case 202 -> {
                System.out.println("Student ID: 202");
                System.out.println("Student Name: Pal Chinna");
                System.out.println("Student Age: 24");
                System.out.println("Student Branch: CSE");
                break;
            }
            case 203 -> {
                System.out.println("Student ID: 203");
                System.out.println("Student Name: Sai Ram");
                System.out.println("Student Age: 22");
                System.out.println("Student Branch: IT");
                break;
            }
            case 204 -> {
                System.out.println("Student ID: 204");
                System.out.println("Student Name: Chandu");
                System.out.println("Student Age: 21");
                System.out.println("Student Branch: CSE");
                break;
            }
            case 205 -> {
                System.out.println("Student ID: 5");
                System.out.println("Student Name: Sidhartha");
                System.out.println("Student Age: 21");
                System.out.println("Student Branch: ECE");
                break;
            }
            default -> System.out.println("Student ID not found");
        }
    }
}
