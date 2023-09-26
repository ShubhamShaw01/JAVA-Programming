package com.shubham;
import java.util.*;

public class CalculatorFunction {
    public static Double addition(double no1, double no2){
        return (no1+no2);
    }
    public static Double substraction(double no1, double no2){
        return (no1-no2);
    }
    public static Double multiply(double no1, double no2){
        return (no1*no2);
    }
    public static Double division(double no1, double no2){
        return (no1/no2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String check;
        do{
            System.out.printf("Enter the First no : ");
            double no1= sc.nextDouble();
            System.out.println();
            System.out.printf("Enter the Second no : ");
            double no2= sc.nextDouble();
            System.out.println();
            System.out.println("Press 1 for Additon");
            System.out.println("Press 2 for Substration");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for division");
            System.out.printf("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    Double sum=addition(no1,no2);
                    System.out.println(no1 + " + " + no2 + " = " + sum);
                    break;
                case 2:
                    Double sub=substraction(no1,no2);
                    System.out.println(no1 + " - " + no2 + " = " + sub);
                    break;
                case 3:
                    Double mul=multiply(no1,no2);
                    System.out.println(no1 + " * " + no2 + " = " + mul);
                    break;
                case 4:
                    Double div=division(no1,no2);
                    System.out.println(no1 + " / " + no2 + " = " + div);
                    break;
                default:
                    System.out.println("Invalid Input! Try again");
            }
            System.out.printf("Enter y or yes to continue... : ");
            check = sc.next();
            System.out.println();
        }while(check.equals("y") || check.equals("yes") );
    }
}
