package com.shubham;

import java.util.Scanner;

public class GDC {
    public static int hCF (int no1,int no2) {
        if(no2==0){
            return no1;
        }
        else {
            return hCF(no2,no1%no2);
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the first no : ");
        int no1= sc.nextInt();
        System.out.print("Enter the second no : ");
        int no2= sc.nextInt();
        int no3=hCF(no1,no2);
        System.out.println("GDC of " + no1 +" and "+  no2 + " is : " + no3);
    }
}
