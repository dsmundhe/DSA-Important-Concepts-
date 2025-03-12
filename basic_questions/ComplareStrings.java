package basic_questions;

public class ComplareStrings {
    public static void main(String[] args) {
        String str1="ABCDE";
        String str2="EDCBA";

        String str3="ROUND";
        String str4="RINGS";

        String str5="START";
        String str6="STUNT";


        //CASE-1
//        System.out.println(mString(str1,str2));

        //CASE-2
//        System.out.println(mString(str3,str4));

        //CASE-3
          System.out.println(mString(str5,str6));
    }
    public static String mString(String str1,String str2){
        if(str1.isEmpty() && str2.isEmpty()){
            return "";
        }
        if(str1.charAt(0) == str2.charAt(0)){
            return "G"+mString(str1.substring(1),str2.substring(1));
        }else{
            return "B"+mString(str1.substring(1),str2.substring(1));
        }
    }
}
