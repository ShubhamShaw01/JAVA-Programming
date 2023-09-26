package com.shubham;
//method over Writing
class I {
    void show(int a){
        System.out.println("a is "+ a );
    }
}
class J extends I{
    void  show (int a,int b){
        System.out.println("The result is : "+(a+b));
    }
}
public class OverWriting {
    public static void main(String[] args) {
        J j =new J();
        j.show(8);
        j.show(6,8);
    }
}
