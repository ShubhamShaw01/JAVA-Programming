package com.shubham;

import java.util.Scanner;

class Rectangle{
    int length,breath;
    void getData(int x,int y){
        length=x;
        breath=y;
    }
    int rectArea(){
        return length*breath;
    }
}
public class RectArea {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the length of the Rectangle : ");
        int l= sc.nextInt();
        System.out.print("Enter the breath of the Rectangle : ");
        int b= sc.nextInt();
        Rectangle rect =new Rectangle();
        rect.getData(l,b);
        int area=rect.rectArea();
        System.out.println("The area of the Rectangle is : "+ area);
    }
}
