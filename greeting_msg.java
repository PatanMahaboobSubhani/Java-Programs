package com.subhani;

import java.util.Scanner;

public class greeting_msg {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Have a good name please: ");
        String name =  input.nextLine();
        System.out.print("Mr/Miss " + name + " Good morning have a good day!");
    }
}
