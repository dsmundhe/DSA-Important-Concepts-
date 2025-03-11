package oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes sh=new Shapes();
        Circle c1=new Circle(10);
        Square s1=new Square(20);

        //check instance
        System.out.println(c1 instanceof Shapes);


        //method overriding
        sh.iam();
        c1.iam();
        s1.iam();

        // Method Overloading
        System.out.println("Area of Square : " +s1.area(10));
        s1.area();

        System.out.println("Area Of Circle : "+ c1.area(5));
        c1.area();
    }
}
