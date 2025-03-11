package oops.inheritance.Shapes;

public class Square extends Shape{
    public void area(){
        System.out.println("Square : s * s");
    }
    Square(int l,int b){
        super(l,b);
    }
}
