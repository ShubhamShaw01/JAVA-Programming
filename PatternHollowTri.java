package com.shubham;
import java.util.*;

public class PatternHollowTri {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.printf("Enter the rows : ");
        int rows =sc.nextInt();
        System.out.println();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.printf(" ");
            }
            for(int k=1;k<=i;k++){
                if(k==1 || k==i || i== rows){
                    System.out.printf("* ");
                }
                else{
                    System.out.printf("  ");
                }
            }
            System.out.println();
        }
    }
}
