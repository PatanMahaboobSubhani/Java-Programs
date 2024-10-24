package com.subhani;


import java.util.Scanner;

public class dublicate_eraser {
    public static void main(String [] args){
        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        int [] nums = new int[] {1,2,2,5,4,3,8,6,4,3};
        for ( i = 0; i < nums.length; i++){
            for ( j = i + 1; j<nums.length; j++){
                if (nums[i] == nums[j]){
                    System.out.print(nums[j]);
                }
            }
        }
    }
}
