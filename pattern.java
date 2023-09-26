package com.shubham;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        System.out.print("Enter the rows : ");
        Scanner sc =new Scanner(System.in);
        int row= sc.nextInt();
        System.out.println();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
