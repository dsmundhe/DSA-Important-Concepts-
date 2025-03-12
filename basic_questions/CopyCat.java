package basic_questions;

public class CopyCat {
    public static void main(String[] args) {
        String str="abababa";
        String newStr=copyString(str);

        System.out.println("Mis Placed : "+misPlaced(str,newStr));

    }


    public static int misPlaced(String str1,String str2){
        int couter=0;
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i))couter++;
        }
        return couter;
    }

    public static String copyString(String str){
       String st=new String();
       st +=str.charAt(str.length()-1);
        for (int i = 0; i <=str.length()-2 ; i++) {
            st+=str.charAt(i);
        }
        return st;

    }
}
