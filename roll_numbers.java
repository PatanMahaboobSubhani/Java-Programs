package com.subhani;

import java.util.Arrays;
import java.util.Scanner;

public class roll_numbers {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int[] students = {1, 2, 3, 5, 8, 25};
        //System.out.print(Arrays.toString(students));
        change(students);
        System.out.println(Arrays.toString(students));
    }
    static void change(int [] arr){
        arr[0] = 201;
    }
//        for(int i =0; i < students.length; i++){
//            students[i] = sc.nextInt();
//        }
//        for(int i =0; i < students.length; i++){
//            System.out.print(students[i] + " ");
//        }


        //

}
