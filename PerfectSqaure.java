package com.shubham;
import java.util.Scanner;

public class PerfectSqaure {
    public static double squareRoot(int no) {
        return Math.sqrt(no);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int no = sc.nextInt();
        double result = squareRoot(no);

        if (result % 1 == 0) {
            System.out.println(no + " is a perfect square.");
        }
        else {
            System.out.println(no + " is not a perfect square. Its square root is " + result);
        }
    }
}
