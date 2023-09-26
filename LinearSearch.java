package com.shubham;

import java.util.Scanner;

public class LinearSearch {
    public int search(int arr[], int size, int elementSearch, int index) {
        if (index < size) {
            if (elementSearch == arr[index]) {
                return index;
            }
            else {
                return search(arr, size, elementSearch, index + 1);
            }
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int elementSearch = sc.nextInt();
        LinearSearch linearSearch = new LinearSearch();
        int result = linearSearch.search(arr, size, elementSearch, 0);
        if (result == -1) {
            System.out.println(elementSearch + " not found");
        } else {
            System.out.println(elementSearch + " found in position " + result);
        }
    }
}
