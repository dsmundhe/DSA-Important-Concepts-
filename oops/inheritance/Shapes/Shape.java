package oops.inheritance.Shapes;

public class Shape {
    int l;
    int b;
    public void area(){
        System.out.println("I am Shape!");
    }
    public void type(){
        System.out.println("Comes Under Shape class!");
    }
    Shape(int l,int b){
        this.l=l;
        this.b=b;
    }
}
