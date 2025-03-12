package oops.interfaces;

public class Main {
    public static void main(String[] args) {
        Car c1 =new Car();
        c1.start();
        c1.stop();

        //Access static methods
        Engine.print();
        Brake.print();
        Media.print();

        //for ship
        Ship sh=new Ship();
        sh.start();
        sh.stop();
        sh.brake();
    }
}
