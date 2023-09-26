package com.shubham;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many input you want to give : ");
        int size=sc.nextInt();
        System.out.println();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            System.out.print("enter the "+ i +" element: ");
            arr[i]= sc.nextInt();
        }
        System.out.println("The following array is : ");
        for(int i=0;i<size;i++){
            System.out.printf(arr[i] + " ");
        }
        System.out.println();
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j+1]<arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("The sorted array is : ");
        for(int i : arr) {
            System.out.printf(i + " ");
        }
    }
}
