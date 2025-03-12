package oops.interfaces;

public class Car implements Engine,Brake,Media{
    @Override
   public void start(){
        System.out.println("Car started!");
    }
    public Car() {
        super();
    }

    @Override
    public void brake() {
        System.out.println("Car braked!");
    }

    @Override
    public void stop() {
        System.out.println("Car stoped!");
    }
}
