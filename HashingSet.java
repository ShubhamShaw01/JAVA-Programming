package com.shubham;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashingSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        System.out.print("Enter the size of input you want to add in set : ");
        int size=sc.nextInt();
        for(int i = 0 ;i<=size;i++){
            i=sc.nextInt();
            set.add(i);
        }
        System.out.println("Your entered hash set is : " + set);
        System.out.print("Enter the element to check in set");
        int no=sc.nextInt();
        if(set.contains(no))
            System.out.println("Yes "+ no + " is there");
        else
            System.out.println("Yes "+ no + " is not there");
        System.out.print("Enter the to element delete : ");
        int del=sc.nextInt();
        set.remove(del);
        System.out.println("New hashset is : "+set);
        //using iterator in hash map
        Iterator<Integer> it =set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Size of the hashset : "+set.size());
    }
}
