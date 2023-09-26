package com.shubham;

import java.util.Scanner;

public class FactorialRecursive {
    public static int factorial(int no) {
        int fact=1;
        if(no == 1 || no== 0){
            return 1;
        }
        else{
            fact*=no*factorial(no-1);
            return fact;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the no to check its factorial : ");
        int no =sc.nextInt();
        int factResult=factorial(no);
        System.out.println(no + "! = " + factResult);
    }
}
