package oops.inheritance;

public class Animal {
    int age;
    String type;

    public void movement(){
        System.out.println("Walking!");
    }
    Animal(String type,int age){
        this.type=type;
        this.age=age;
    }
}
