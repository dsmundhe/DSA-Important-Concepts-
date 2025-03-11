package oops.inheritance.Shapes;

public class Circle extends Shape{
    public void area(){
        System.out.println("Circle : pei * r * r ");
    }
    Circle(int a,int b){
        super(a,b);
    }
}
