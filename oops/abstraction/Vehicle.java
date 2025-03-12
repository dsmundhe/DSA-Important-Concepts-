package oops.abstraction;

public abstract class Vehicle {
    public String type;
    abstract void start();
    abstract void stop();

    //can create it's constructor
    Vehicle(String type){
        this.type=type;
        System.out.println("I am vehical!" + this.type);
    }

}
