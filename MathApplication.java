package com.shubham;

import java.util.Scanner;

class MathOperation{
    static double mul(double x,double y){
        return x*y;
    }
    static double div(double x,double y){
        return x/y;
    }
}
public class MathApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first no : ");
        double x= sc.nextDouble();
        System.out.print("Enter the Second no : ");
        double y= sc.nextDouble();
        double value=MathOperation.mul(x,y);
        double value2=MathOperation.div(value,2);
        System.out.println("multiplication of this two no "+ x + "and " + y + " = "+ value);
        System.out.println("Dividing it by 2 = "+ value2);

    }
}
