package com.shubham;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the %d element : ", i + 1);
            arr[i] = sc.nextInt();
        }
        System.out.println(" .. Your entered array is .. ");
        System.out.println(Arrays.toString(arr));
        for(int i=1;i<size;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println(" .. Your entered array is .. ");
        System.out.println(Arrays.toString(arr));
    }
}
