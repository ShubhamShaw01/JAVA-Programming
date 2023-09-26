package com.shubham;

import java.util.Scanner;

public class PetersonNo {
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
    public static void petersoncheck(int original,int check){
        if(original==check){
            System.out.println(original + " is a Peterson Number");
        }
        else {
            System.out.println(original + " is not a Peterson Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.printf("Enter the no to check its factorial : ");
        int no =sc.nextInt();
        System.out.println();
        int factResult=0;
        int flag = no;
        while(flag>0){
            int rem=flag%10;
            flag/=10;
            factResult+=factorial(rem);
        }
        petersoncheck( no, factResult);
    }
}

