package com.shubham;

interface Vehicle{
    void start();
    void stop();
}
interface Music{
    void playMusic();
    void changeTrack();
}
class Car implements Vehicle, Music{
    @java.lang.Override
    public void start() {
        System.out.println("Start the car");
    }

    @java.lang.Override
    public void stop() {
        System.out.println("Stop the car");
    }

    @java.lang.Override
    public void playMusic() {
        System.out.println("Start the music");
    }

    @java.lang.Override
    public void changeTrack() {
        System.out.println("change the song");
    }
}
public class MultipleInheritances {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.playMusic();
        car.changeTrack();
        car.stop();

    }
}
