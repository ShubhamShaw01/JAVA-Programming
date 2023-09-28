package com.shubham;
import java.util.Scanner;

public class MyModuleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyModule myModule = new MyModule();

        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        myModule.greet(name);

        Calculator calculator = new Calculator();

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the arithmetic symbol to perform the operation (+,-,*,/): ");
        String operator = sc.next();

        double result;

        switch (operator) {
            case "+":
                result = calculator.add(a, b);
                break;
            case "-":
                result = calculator.sub(a, b);
                break;
            case "*":
                result = calculator.multiply(a, b);
                break;
            case "/":
                result = calculator.divide(a, b);
                break;
            default:
                result = 0;
                System.out.println("Invalid input.");
                break;
        }

        System.out.println("Result: " + result);
    }
}
