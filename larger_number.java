package com.subhani;

import java.util.Scanner;

public class larger_number {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int [] nums = new int[] {1,2,5,9,10,3};
        int max = nums[0];
        for (int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println("largest number in the series is " + max);
    }
}
