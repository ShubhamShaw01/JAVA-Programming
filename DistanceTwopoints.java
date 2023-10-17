//calculate the distance between two points user will provide these two point either two points 2d or 3d of this problem by using method overriding
package com.shubham;

import java.util.Scanner;

class point2D{
    double x,y;
    public point2D(double x,double y){
        this.x=x;
        this.y=y;
    }
    double dist2d(point2D other){
        return Math.sqrt(Math.pow((x- other.x),2)+Math.pow((y- other.y),2));
    }
}
class point3D extends point2D{
    double z;
    public  point3D(double x, double y, double z){
        super(x, y);
        this.z=z;
    }
    double dist3d(point3D other){
        return Math.sqrt(Math.pow((x- other.x),2)+Math.pow((y-other.y),2)+Math.pow((z- other.z),2));
    }
}
public class DistanceTwopoints {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1 for distance for 1d \n 2 for 3d");
        System.out.print("Enter your choice : ");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.print("Enter the x - coordinate of first point : ");
                double x1=sc.nextDouble();
                System.out.print("Enter the y - coordinate of first point : ");
                double y1=sc.nextDouble();
                System.out.print("Enter the x - coordinate of second point : ");
                double x2=sc.nextDouble();
                System.out.print("Enter the y - coordinate of second point : ");
                double y2=sc.nextDouble();
                point2D point1=new point2D(x1,y1);
                point2D point2=new point2D(x2,y2);
                double distance= point1.dist2d(point2);
                System.out.println("The distance between two points are : "+ distance);
                break;
            case 2:
                System.out.print("Enter the x - coordinate of first point : ");
                double x1_3d=sc.nextDouble();
                System.out.print("Enter the y - coordinate of first point : ");
                double y1_3d=sc.nextDouble();
                System.out.print("Enter the z - coordinate of first point : ");
                double z1_3d=sc.nextDouble();
                System.out.print("Enter the x - coordinate of second point : ");
                double x2_3d=sc.nextDouble();
                System.out.print("Enter the y - coordinate of second point : ");
                double y2_3d=sc.nextDouble();
                System.out.print("Enter the z - coordinate of first point : ");
                double z2_3d=sc.nextDouble();
                point3D point1_3D=new point3D(x1_3d,y1_3d,z1_3d);
                point3D point2_3D=new point3D(x2_3d,y2_3d,z2_3d);
                double distance3D= point1_3D.dist3d(point2_3D);
                System.out.println("The distance between two points are : "+ distance3D);
                break;
            default:
                System.out.println("Enter value is wrong");
                break;
        }
    }
}
