package com.shubham;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first no: ");
        int a = sc.nextInt();
        System.out.print("\nEnter the second no: ");
        int b=sc.nextInt();
        int c= a+b;
        System.out.print("\nthe sum of two no: ");
        System.out.println(c);
    }
}
