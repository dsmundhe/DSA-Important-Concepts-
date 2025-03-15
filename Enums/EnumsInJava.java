package Enums;

public class EnumsInJava {
    public static void main(String[] args) {
        Week week=new Week();
        Week.week today=Week.week.Monday;
        System.out.println(today);
        System.out.println(today.ordinal());
        for(Week.week val: Week.week.values()){
            System.out.println(val);
        }

    }
}
