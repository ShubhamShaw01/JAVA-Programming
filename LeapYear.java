package com.shubham;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the year to check : ");
        int year = sc.nextInt();
        if(year%400==0){
            System.out.println(year + " is a leap year");
        } else if (year%100==0 || year%4==0) {
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
}
