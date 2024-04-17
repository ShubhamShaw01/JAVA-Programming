package com.shubham;

import java.util.ArrayList;
import java.util.Scanner;

public class StackArr {
    static ArrayList<Integer> arr = new ArrayList<>();
    public static boolean isEmpty(){
        return arr.size()==0;
    }
    public static void push(int data){
        arr.add(data);
    }
    public static int pop(){
        if(isEmpty()) return -1;
        int top=arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        return top;
    }
    public static int peek(){
        if(isEmpty()) return -1;
        return arr.get(arr.size()-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackArr stack = new StackArr();
        System.out.print("Enter how many input you want to give  : ");
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            System.out.print("Enter the " + (i+1) + "element : ");
            stack.push(sc.nextInt());
        }
        while (!isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
