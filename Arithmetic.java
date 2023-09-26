package com.shubham;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String check;
        do {
            System.out.print("Enter the first no : ");
            int no1 = sc.nextInt();
            System.out.println();
            System.out.print("Enter the second no : ");
            int no2 = sc.nextInt();
            System.out.println();
            System.out.println("Enter 1 for addition, 2 for subs, 3 for multiply, 4 for division :");
            int operation = sc.nextInt();
            switch (operation) {
                case 1:
                    int sum = no1 + no2;
                    System.out.println("the sum of" + no1 + " and " + no2 + " = " + sum);
                    break;
                case 2:
                    int sub = no1 - no2;
                    System.out.println("the substraction of" + no1 + " and " + no2 + " = " + sub);
                    break;
                case 3:
                    int mul = no1 * no2;
                    System.out.println("the product of" + no1 + " and " + no2 + " = " + mul);
                    break;
                case 4:
                    double div = (double) no1 / no2;
                    System.out.println("the division of" + no1 + " and " + no2 + " = " + div);
                    break;
                default:
                    System.out.println("you give wrong input!");
                    break;
            }
            System.out.print("Enter y or yes to continue : ");
            check = sc.next();
        } while (check.equals("y") || check.equals("yes"));
    }
}
