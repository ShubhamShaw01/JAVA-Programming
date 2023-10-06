package com.shubham;

class AnimalSound{
    void showMessage(){
        System.out.println("Sound of a animal");
    }
}
class Dogs extends AnimalSound{
    void showMessage(){
        System.out.println("sound = Bark");
    }
}
class Cat extends AnimalSound{
    void showMessage(){
        System.out.println("Sound = Meow");
    }
}
public class Override {
    public static void main(String[] args) {
        AnimalSound myDog=new Dogs();
        AnimalSound myCat=new Cat();
        myDog.showMessage();
        myCat.showMessage();
    }
}
