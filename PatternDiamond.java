package com.shubham;
import java.util.Scanner;

public class PatternDiamond {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter how many rows you want: ");
        int row=sc.nextInt();
        int peak= 10;
        System.out.println();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(peak-- + " ");
            }
            System.out.println();
        }
        for(int i=row;i>0;i--){
            for(int j=row-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print(++peak + " ");
            }
            System.out.println();
        }
    }
}