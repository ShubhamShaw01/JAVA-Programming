package com.shubham;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no to check : ");
        int no=sc.nextInt();
        System.out.println();
        int newNO=0;
        int flag=no;
        while(no!=0){
            int remainder=no%10;
            newNO+=remainder*remainder*remainder;
            no /= 10;
        }
        if(flag!=newNO){
            System.out.println(flag + " it is not Armstrong no");
        }
        else{
            System.out.println(flag + " it is Armstrong no");
        }
    }
}
