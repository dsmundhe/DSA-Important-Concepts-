package oops.abstraction;

public class Main {
    public static void main(String[] args) {
        Bike b1=new Bike("Two wheeler");
        b1.getType();

        Car c1=new Car("Four wheeler");
        c1.getType();

        //@override methods
        //comon methods need to override
        b1.start();
        c1.start();

        //stop
        b1.stop();
        c1.stop();

        //Try to create Vehicle Object
//        Vehicle v1=new Vehicle();
        //it's not possible
        //we can not instantiated abstract class
    }

    public static boolean max(int mainCount, int count) {
        return false;
    }
}
