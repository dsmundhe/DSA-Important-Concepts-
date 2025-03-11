package oops.access;

public class Animal {
    private String type="Wild";
    protected int age =18;
    public String name= "Elephent";
    int price =1888888808;

    public String getType(){
        return this.type;
    }

    public static void main(String[] args) {
        Animal an=new Animal();
        //can access all the types

        //Private variable
        System.out.println(an.type);

        //Protected Variable
        System.out.println(an.age);

        //Public Variable
        System.out.println(an.name);

        //Default Variable
        System.out.println(an.price);
    }

}
