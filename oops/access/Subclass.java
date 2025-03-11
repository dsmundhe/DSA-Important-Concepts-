package oops.access;

public class Subclass extends Animal{
    public static void main(String[] args) {

        Subclass sub=new Subclass();
        // in subclass can acces public and protected and default;

        //Private Variable (can't access without geters() and seters() methods
//        System.out.println(sub.type);

        //Protected Variable
        System.out.println("Protected " +sub.age);

        //Public Variable
        System.out.println("Public : "+sub.name);

        //Default Variable
        System.out.println("Default : "+sub.price);

        //Private Variable through getType() Method
        System.out.println("Private : "+ sub.getType());

    }
}
