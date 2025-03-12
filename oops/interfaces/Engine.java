package oops.interfaces;

public interface Engine {
    void start();
    void stop();

    //static method
    public static void print(){
        System.out.println("I am Engine!");
    }

    //constructor creation not possible
//    Engine(){
//
//    }
}
