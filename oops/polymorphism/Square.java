package oops.polymorphism;

public class Square extends Shapes{
    int side;
    @Override
    public  void iam(){
        System.out.println("Hey i am Square");
    }
   public Square(int side){
        this.side=side;
   }

   public void area(){
       System.out.println("I am area function without any arguments!");
   }
   public int area(int val){
        return val*val;
   }

}
