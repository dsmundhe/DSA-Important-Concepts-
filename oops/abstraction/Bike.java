package oops.abstraction;

public class Bike extends Vehicle {
     String type;
    @Override
   public void start() {
        System.out.println("Bike started!");
    }
    @Override
    public void stop(){
        System.out.println("Bike Stoped!");
    }
    public Bike(String type){
        super(type);
    }
    public void getType(){
        System.out.println(super.type);
    }
}
