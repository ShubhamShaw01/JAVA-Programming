package com.shubham;
import java.util.*;

public class Adding2Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the first array : ");
        int size1 = sc.nextInt();
        System.out.println();
        System.out.println("Enter the First array ");
        int arr[]=new int[size1];
        for(int i =0;i<size1;i++){
            System.out.print("Enter the " + (i+1) + " element : ");
            arr[i]=sc.nextInt();
            System.out.println();
        }
        System.out.print("Enter the size of the second array : ");
        int size2 = sc.nextInt();
        System.out.println();
        System.out.println("Enter the second array ");
        int arr1[]=new int[size1];
        for(int i =0;i<size2;i++){
            System.out.print("Enter the " + (i+1) + " element : ");
            arr1[i]=sc.nextInt();
            System.out.println();
        }
        int newsize = Math.max(size1, size2);
        int arr3[]=new int[newsize];
        for(int i=0;i<newsize;i++){
            arr3[i]=arr[i]+arr1[i];
        }
        System.out.println("sum of the two array is");
        for(int i=0;i<newsize;i++){
            System.out.print(arr3[i]+ "  ");
        }
        System.out.println();
    }
}
