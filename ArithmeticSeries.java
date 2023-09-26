package com.shubham;

import java.util.Scanner;

public class ArithmeticSeries {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the first term : ");
        int firstTerm=sc.nextInt();
        System.out.print("Enter the difference of the arithmetic series : ");
        int diff=sc.nextInt();
        System.out.print("Enter the size of the series : ");
        int size= sc.nextInt();
        int sum=0;
        for(int i=0;i<size;i++){
            int temp =firstTerm+(diff*i);
            sum+=temp;
            System.out.printf("%d\t",temp);
        }
        System.out.println();
        System.out.println("Sum of this series is : "+sum);
    }
}
