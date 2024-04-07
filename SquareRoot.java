package com.shubham;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the no for which you want to find the root in round of : ");
        int x = sc.nextInt();
        int result= squareRoot(x);
        System.out.println("Square root is " + result);
    }
    private static int squareRoot(int x){
        if(x==0||x==1) return x;
        int left = 1, right=x/2;
        while(left<=right) {
            int mid = left + (right - left) / 2;
            long sqrt = (long) mid * mid;
            if (sqrt == x) return mid;
            else if (sqrt < x) left += 1;
            else right -= 1;
        }
        return right;
    }
}
