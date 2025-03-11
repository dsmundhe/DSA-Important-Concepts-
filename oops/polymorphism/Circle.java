package oops.polymorphism;

public class Circle extends Shapes{
    int r;
    @Override
    public void iam(){
        System.out.println("Hey I am Circle!");
    }
    public Circle(int r){
        this.r=r;
    }
    public void area(){
        System.out.println("I am area without Radius !");
    }
    public float area(int r){
        return 3.14f * r * r;
    }
}
