package com.shubham;
import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int row=sc.nextInt();
        System.out.println();
        for(int i=1;i<=row;i++){
            for(int j=row-i;j>=1;j--){
                System.out.print("\t");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
