package oops.inheritance;

public class Dog extends Animal{
    String move;
    public void movement(){
        System.out.println("DOG : Running ");
    }
Dog(String type,int age, String move){
        super(type,age);
        this.move=move;
        super.type=type;
}
    public static void main(String[] args) {

    }
}
