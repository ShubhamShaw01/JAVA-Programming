package com.shubham;
import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no to check : ");
        int no=sc.nextInt();
        System.out.println();
        int newNO=0;
        int flag=no;
        while(no!=0){
            newNO=(newNO*10)+no%10;
            no /= 10;
        }
        if(flag!=newNO){
            System.out.println(flag + " it is not pallindrome");
        }
        else{
            System.out.println(flag + " it is pallindrome");
        }
    }
}
