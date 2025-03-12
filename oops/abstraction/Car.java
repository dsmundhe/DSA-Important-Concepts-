package oops.abstraction;

public class Car extends Vehicle {
    String type;
    @Override
    public void start(){
        System.out.println("Car is started!");
    }

    @Override
    public void stop(){
        System.out.println("Car I stoped!");
    }

    public Car(String type){
        super(type);
    }
    public void getType(){
        System.out.println(super.type);
    }
}
