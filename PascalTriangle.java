package com.shubham;
import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many rows you want : ");
        int rows = sc.nextInt();
        System.out.println();
        int flag=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            int ver=flag;
            while(ver>0){
                int rem=ver%10;
                System.out.print(rem + " ");
                ver/=10;
            }
            flag*=11;
            System.out.println();
        }
    }
}
