package com.shubham;
//example of inheritance
class  A {
    static int a = 3;
    static int c = 4;
}
public class B extends A{
    public static void main(String[] args) {
        System.out.println(" a = " + a);
        c=a+c;
        System.out.println(" c = "+c);
    }
}
