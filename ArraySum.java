package com.shubham;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size of the array : ");
        int size=sc.nextInt();
        System.out.println();
        int arr[] =new int[size];
        for(int i=0;i<size;i++){
            System.out.printf("Enter the " + (i+1) + " element : ");
            arr[i]=sc.nextInt();
            System.out.println();
        }
        int arrSum=0;
        System.out.println(Arrays.toString(arr));
        System.out.println("the sum of the array : " + arrSum);
    }
}
