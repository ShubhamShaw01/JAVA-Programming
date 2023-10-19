//write a code to do ternary operation question biggests number among the three
package com.shubham;

import java.util.Scanner;

public class TernaryOperation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first no : ");
        int n1= sc.nextInt();
        System.out.print("Enter the second no : ");
        int n2= sc.nextInt();
        System.out.print("Enter the third no : ");
        int n3= sc.nextInt();
        int max=(n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3);
        System.out.println("Max is "+ max);
    }
}
