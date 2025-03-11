package oops.inheritance.Shapes;

public class Main {
    public static void main(String[] args) {
        Shape s1=new Shape(10,20);
        s1.area();
        System.out.println("Sides : "+s1.l + " " + s1.b);

        Circle c1 =new Circle(10,20);
        c1.area();
        c1.type();
        System.out.println("Radius : "+c1.l);

        Square sq1=new Square(10,20);
        sq1.area();
        sq1.type();
        System.out.println("Length : "+sq1.l);
        System.out.println("Bridth : "+sq1.b);
    }
}
