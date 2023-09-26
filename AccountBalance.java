package com.shubham;

import java.util.Scanner;

class Balance{
    String name;
    double bal;
    Balance(String n,double b){
        name=n;
        bal=b;
    }
    void showMessage(){
        if(bal>0){
            System.out.println();
            System.out.println(name + " " + bal);
        }
    }
}
public class AccountBalance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of no of your inputs : ");
        int size=sc.nextInt();
        Balance[] arr=new Balance[size];
        for(int i=0;i<size;i++){
            System.out.printf("Enter the %d person name : ",i+1);
            String name=sc.next();
            System.out.printf("Enter the %d person name : ",i+1);
            double balance= sc.nextDouble();
            arr[i]=new Balance(name,balance);
        }
        for(int i=0;i<size;i++){
            arr[i].showMessage();
        }
    }
}
