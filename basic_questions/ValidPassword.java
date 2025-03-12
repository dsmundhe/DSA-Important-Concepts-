package basic_questions;

public class ValidPassword {
    public static void main(String[] args) {
        String password="@#dipakdA1";
        isValidFun(password);
    }

    public static void isValidFun(String str){
        char firstChar=str.charAt(0);
        if(Character.isDigit(firstChar)){
            System.out.println("Invalid!");
            return;
        }
        int sp=0;
        int az=0;
        int AZ=0;
        int num=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if((ch=='@' || ch=='#' || ch=='$'||ch=='*')){
                sp++;
            }else if(Character.isDigit(ch)){
                num++;
            }else if(Character.isLowerCase(ch)){
                az++;
            }else if(Character.isUpperCase(ch)){
                AZ++;
            }
        }

        if(sp >0 && az >0 && AZ >0&& num >0){
            System.out.println("Valid!");
        }else{
            System.out.println("Invalid!");
        }
    }


    public static void isValidPass(String str){
        char firstChar=str.charAt(0);
        int firstCharNum=Character.getNumericValue(firstChar);
        if(firstCharNum >=1){
            System.out.println("Invalid!");
            return;
        }
        if(str.length()<8){
            System.out.println("Invalid!");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int chVal=Character.getNumericValue(ch);
            if((ch=='@' || ch=='#' || ch=='@'||ch=='*')|| (chVal >=1) || (ch >='a') || (ch>='A')){
            }else {
                System.out.println("Invalid!");
                return;
            }
        }
        System.out.println("Valid!");

    }
}
