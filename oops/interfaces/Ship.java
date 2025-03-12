package oops.interfaces;

public class Ship implements Engine ,Brake{

    @Override
    public void brake() {
        System.out.println("Ship Braked!");
    }

    @Override
    public void start() {
        System.out.println("Ship Started!");
    }

    @Override
    public void stop() {
        System.out.println("Ship Stoped!");
    }
}
