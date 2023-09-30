package com.shubham;
import java.util.Scanner;

public class PerfectNumber {
    public static int isPerfect(int no) {
        int sum = 0;
        for (int i = 1; i < no; i++) {
            if (no % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it is a perfect number: ");
        int no = sc.nextInt();
        int result = isPerfect(no);

        if (no == result) {
            System.out.println(no + " is a perfect number.");
        }
        else {
            System.out.println(no + " is not a perfect number, and the sum of its divisors is " + result + ".");
        }
    }
}
