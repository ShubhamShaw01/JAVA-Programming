package com.shubham;

class Animal{
    public String message = " is a living organisms";
}
class Dog extends Animal{
    public String message="Bark";
}
class GermanSpehard extends Dog{
    public String message = "Look like wolf";
    public void setMessage(){
        Animal a =new Animal();
        System.out.println("Dog "+a.message);
        System.out.println("Dog use to "+super.message);
        System.out.println("German Shepard is a dog "+message);
    }
}
public class AnimalIn {
    public static void main(String[] args) {
        GermanSpehard gs = new GermanSpehard();
        gs.setMessage();
    }
}
