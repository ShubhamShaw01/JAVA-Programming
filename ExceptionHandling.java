package com.shubham;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();

        try {
            System.out.println("Result of division: " + num1/num2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
