package com.shubham;
import java.util.Scanner;

public class LCM {
    public static int gcd(int no1, int no2) {
        if (no2 == 0) {
            return no1;
        }
        else {
            return gcd(no2, no1 % no2);
        }
    }

    public static int lcm(int no1, int no2) {
        int result = gcd(no1, no2);
        return (no1 * no2) / result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int no1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int no2 = sc.nextInt();
        int result = lcm(no1, no2);
        System.out.println("The LCM of " + no1 + " and " + no2 + " is " + result + ".");
    }
}
