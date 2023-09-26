package com.shubham;

import java.util.Scanner;

public class PrimeRec {
    public static boolean isPrime(int no,int flag){
        if(no<=1){
            return false;
        }
        else if(flag<no){
            if(no%flag==0){
                return false;
            }
            else{

                return isPrime(no,++flag);
            }
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the no to check its prime or not : ");
        int no= sc.nextInt();
        if(isPrime(no,2)){
            System.out.println("Enter no "+ no +" is prime");
        }
        else{
            System.out.println("Enter no "+ no +" is not prime");
        }
    }
}
