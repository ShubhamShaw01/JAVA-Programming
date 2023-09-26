package com.shubham;
import java.util.Scanner;
public class Armstronginloop {
    public static void armstrong(int i,int end){
        System.out.println("Armstrong no between " + i + " and " + end);
        while(i<=end){
            int flag =i;
            int check = 0;
            while(flag>0) {
                int rem=flag%10;
                rem= rem*rem*rem;
                check+=rem;
                flag/=10;
            }
            if (i==check){
                System.out.println(check);
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the starting of the loop : ");
        int i = sc.nextInt();
        System.out.println();
        System.out.printf("Enter the ending point of the loop : ");
        int end =sc.nextInt();
        System.out.println();
        while (i>end){
            System.out.println("Invalid input the ending point is less than starting point");
            System.out.println("please enter the value of i and end again : ");
            System.out.printf("Enter the value of starting point : ");
            i=sc.nextInt();
            System.out.println();
            System.out.printf("Enter the value of ending point : ");
            end=sc.nextInt();
            System.out.println();
        }
        armstrong(i,end);
    }
}
