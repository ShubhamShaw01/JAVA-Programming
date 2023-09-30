package com.shubham;
import java.util.Scanner;
import java.lang.Math;

public class PerfectCube {
    public static double cubeRoot(int no) {
        return Math.cbrt(no);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int no = sc.nextInt();
        double result = cubeRoot(no);

        if (result % 1 == 0) {
            System.out.println(no + " is a perfect cube.");
        }
        else {
            System.out.println(no + " is not a perfect cube. Its cube root is " + result);
        }
    }
}
