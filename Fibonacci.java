package com.shubham;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the series : ");
        int size= sc.nextInt();
        int t1=0,t2=1,t3;
        for(int i=1;i<=size;i++){
            if(i==1){
                System.out.printf("%d\t",t1);
            }
            else if (i==2) {
                System.out.printf("%d\t",t2);
            }
            else{
                t3=t1+t2;
                System.out.printf("%d\t",t3);
                t1=t2;
                t2=t3;
            }
        }
    }
}
