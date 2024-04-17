package com.shubham;

import java.util.Scanner;

public class StackList {
    static class Node1{
        int data;
        Node1 next;
        Node1(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node1 head=null;
    public static boolean isEmpty() {
        return head == null;
    }
    public void push(int data){
        Node1 newNode = new Node1(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        Node1 top=head;
        head=head.next;
        return top.data;
    }
    public int peek(){
        if(isEmpty()) return -1;
        Node1 top =head;
        return top.data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackList stack=new StackList();
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
