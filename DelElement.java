package com.shubham;

import java.util.ArrayList;
import java.util.Scanner;

public class DelElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<size;i++){
            System.out.printf("Enter the %d element : ",i+1);
            arr.add(sc.nextInt());
        }
        System.out.println("the array you entered...");
        System.out.println(arr);
        System.out.print("Enter the element to delete :");
        int delNo=sc.nextInt();
        int check=0;
        for(int i=0;i<size;i++){
            if(arr.get(i)==delNo){
                arr.remove(i);
                check=1;
                break;
            }
        }
        if(check==0){
            System.out.println(delNo+" is not present in array");
        }
        System.out.println("the new array is ");
        System.out.println(arr);
    }
}
