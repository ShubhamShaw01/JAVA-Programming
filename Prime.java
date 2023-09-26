package com.shubham;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the no to check its prime or not : ");
        int primeNO= sc.nextInt();
        System.out.println();
        int flag=0;
        for(int i=2;i<primeNO;i++){
            if(primeNO % i==0){
                flag++;
            }
        }
        if(flag==0){
            System.out.println(primeNO + " is a prime no ");
        }
        else{
            System.out.println(primeNO + " is not a prime no ");
        }
    }
}
