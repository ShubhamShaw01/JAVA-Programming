package com.shubham;

import java.util.Scanner;

public class TestingScannerMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any thing");
        while(!sc.hasNextInt()){
            sc.nextLine();
            System.out.print("Invalid integer please enter valid integer");
        }
        int i = sc.nextInt();
        //Testing findInLine
        System.out.print("Enter a sentence");
        String a = sc.nextLine();
        String b = sc.next();
        String check = sc.findInLine("Hello");
        System.out.println(check);
    }

}
