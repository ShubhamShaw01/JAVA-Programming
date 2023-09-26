package com.shubham;

import java.util.*;

public class BinarySearch {
    public int search(ArrayList<Integer> arr, int left, int right, int elementSearch) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr.get(mid) == elementSearch) {
                return mid;
            }
            else if (arr.get(mid) < elementSearch) {
                return search(arr, mid + 1, right, elementSearch);
            }
            else {
                return search(arr, left, mid - 1, elementSearch);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            arr.add(sc.nextInt());
        }
        System.out.print("Enter the element to search: ");
        int elementSearch = sc.nextInt();

        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.search(arr, 0, size-1 , elementSearch);

        if (result == -1) {
            System.out.println(elementSearch + " not found");
        }
        else {
            System.out.println(elementSearch + " found in position " + result);
        }
    }
}
