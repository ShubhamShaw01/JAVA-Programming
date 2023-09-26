package com.shubham;
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int row=sc.nextInt();
        System.out.println();
        for(int i=1;i<=row;i++){
            for(int j=row-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=row-1;i>=1;i--){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
