package oops.inheritance;

public class Cow extends  Animal{
    Cow(String type,int age){
        super(type,age);
    }
    @Override
    public void movement(){
        System.out.println("Cow : running !");
    }

}
