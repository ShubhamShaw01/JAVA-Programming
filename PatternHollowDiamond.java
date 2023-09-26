package com.shubham;
import java.util.*;

public class PatternHollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int rows =sc.nextInt();
        System.out.println();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(k==1 || k==i ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=rows-1;i>0;i--){
            for(int j=rows-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                if(k==1 || k==i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
