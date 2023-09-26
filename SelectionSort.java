package com.shubham;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size= sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.printf("Enter the %d element : ",i+1);
            arr[i]=sc.nextInt();
        }
        System.out.println(" .. Your entered array is .. ");
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<size-1;i++){
            int temp=i;
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[temp]){
                    temp=j;
                }
            }
            swap(arr,i,temp);
        }
        System.out.println(" .. Sorted array using selection sort .. ");
        System.out.println(Arrays.toString(arr));
    }
}
