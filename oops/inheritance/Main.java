package oops.inheritance;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Cow c1=new Cow("Peat",21);
        System.out.println(c1.type);
        System.out.println(c1.age);
        c1.movement();

        Dog d1=new Dog("Peat",20,"Running");
        System.out.println(d1.type);
        System.out.println(d1.age);
        System.out.println(d1.move);
        d1.movement();
    }
}
