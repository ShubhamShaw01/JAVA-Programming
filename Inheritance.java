package com.shubham;
class  Bird{
    public String message="chirping";
}
class pigeon extends Bird{
    public String message="Flying";
    public void Printmessage(){
        System.out.println("Piegons "+ message);
        System.out.println("Bird "+super.message);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        pigeon pc= new pigeon();
        pc.Printmessage();
    }
}
