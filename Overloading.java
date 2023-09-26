package com.shubham;

public class Overloading {
    public static void main(String[] args) {
        G g=new G();
        g.show();
        g.show(7);
        g.show(8,9);
    }
}
class G{
    void show(){
        System.out.println("today is Wednesday");
    }
    void show(int a){
        System.out.println("the value of a is "+ a);
    }
    void show(int a ,int b){
        System.out.println("Sum of two no are : "+(a+b));
    }
}