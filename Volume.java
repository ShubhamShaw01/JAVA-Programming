package com.shubham;

import java.util.Scanner;

class CubeOrCuboid{
    int length,width,height;
    public CubeOrCuboid(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    int calculateVolume(){
        return length*width*height;
    }
}
public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for cube \n or other any no for cuboid : ");
        int choice=sc.nextInt();
        if (choice==1){
            System.out.print("Enter the edge length of the cube : ");
            int length=sc.nextInt();
            CubeOrCuboid c =new CubeOrCuboid(length,length,length);
            int cubeVolume=c.calculateVolume();
            System.out.println("Volume of cube : " + cubeVolume);
        }
        else {
            System.out.print("Enter the edge length of the cuboid : ");
            int length=sc.nextInt();
            System.out.print("Enter the edge width of the cuboid : ");
            int width=sc.nextInt();
            System.out.print("Enter the edge height of the cuboid : ");
            int height=sc.nextInt();
            CubeOrCuboid c =new CubeOrCuboid(length,width,height);
            int cubeVolume=c.calculateVolume();
            System.out.println("Volume of cube : " + cubeVolume);
        }
    }
}