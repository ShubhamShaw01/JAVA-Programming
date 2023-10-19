//Calculate the volume of a box by using overriding construct user can put 3 different values say some values on no values
package com.shubham;

import java.util.Scanner;

public class Box {
    int length, width, height;

    public Box() {
        this.length = 1;
        this.width = 1;
        this.height = 1;
    }

    public Box(int length) {
        this.length = length;
        this.width = 1;
        this.height = 1;
    }

    public Box(int length, int width) {
        this.length = length;
        this.width = width;
        this.height = 1;
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    int calculateVolume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Box b = new Box();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many input values you want to provide (0 to 3): ");
        int choice = sc.nextInt();

        if (choice == 0) {
            int result = b.calculateVolume();
            System.out.println("The volume is: " + result);
        } else if (choice == 1) {
            System.out.print("Enter the length: ");
            int length = sc.nextInt();
            b = new Box(length);
            int result = b.calculateVolume();
            System.out.println("The volume is: " + result);
        } else if (choice == 2) {
            System.out.print("Enter the length: ");
            int length = sc.nextInt();
            System.out.print("Enter the width: ");
            int width = sc.nextInt();
            b = new Box(length, width);
            int result = b.calculateVolume();
            System.out.println("The volume is: " + result);
        } else if (choice == 3) {
            System.out.print("Enter the length: ");
            int length = sc.nextInt();
            System.out.print("Enter the width: ");
            int width = sc.nextInt();
            System.out.print("Enter the height: ");
            int height = sc.nextInt();
            b = new Box(length, width, height);
            int result = b.calculateVolume();
            System.out.println("The volume is: " + result);
        } else {
            System.out.println("Invalid choice");
        }
    }
}
