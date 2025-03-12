package oops.interfaces;

public interface Media {
    void start();
    void stop();
    static void print(){
        System.out.println("I am Media!");
    }
}
