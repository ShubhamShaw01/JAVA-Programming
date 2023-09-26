package com.shubham;
import java.util.*;
class DimensionOneD {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting in x no");
        this.x = x;
    }
}

class DimensionTwoD extends DimensionOneD {
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in derived and setting in y no");
        this.y = y;
    }

    public void printMessage() {
        System.out.println("the dimensional array given by is " + super.x + "i + " + y + "j");
    }
}

public class TwoDimensioHeritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DimensionTwoD di2 = new DimensionTwoD();
        System.out.print("Enter the value of x dimension : ");
        int x = sc.nextInt();
        System.out.println();
        System.out.println(di2.getX());
        di2.setX(x);
        System.out.print("Enter the value of y dimension : ");
        int y = sc.nextInt();
        di2.setY(y);
        System.out.println(di2.getY());

        di2.printMessage();
    }
}
