package com.shubham;

import java.util.Scanner;
import java.lang.Math;

public class GeometricSeries {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the series : ");
        double size=sc.nextDouble();
        System.out.print("Enter the first term of GP : ");
        double firstTerm=sc.nextDouble();
        System.out.print("Enter the no in which power applied : ");
        double no=sc.nextInt();
        double sum=0;
        for(double i=0;i<size;i++){
            double temp=firstTerm*Math.pow(no,i);
            sum+=temp;
            System.out.print(temp+"\t");
        }
        System.out.println();
        System.out.println("sum of the series : "+sum);
    }
}
