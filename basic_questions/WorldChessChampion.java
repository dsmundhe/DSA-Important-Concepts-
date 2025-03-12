package basic_questions;

import java.sql.SQLOutput;

public class WorldChessChampion {
    public static void main(String[] args) {
        String str="CCCCCCCCCCCCCC";
        String str1="CDCDCDCDCDCDCD";
        String str3="DDCCNNDDDCCNND";
        String str4="NNDNNDDDNNDNDN";

        //CASE-1
        System.out.println("Charls Price : "+chessFun(str,100));

        //CASE-2
        System.out.println("Charls Price : "+chessFun(str1,400));

        //CASE-3
        System.out.println("Charls Price : "+chessFun(str3,30));

        //CASE-4
        System.out.println("Charls Price : "+chessFun(str4,1));
    }
    public static int chessFun(String str,int priceX){
        int charls=0;
        int chef=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='C')charls++;
            if(str.charAt(i)=='N')chef++;
        }
        if(charls>chef){
            return 60 * priceX;
        }else if(charls<chef){
            return 40 * priceX;
        }else if(charls==chef){
            return 55*priceX;
        }
        return -1;
    }

}
