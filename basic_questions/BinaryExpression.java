package basic_questions;

import javax.swing.plaf.PanelUI;

public class BinaryExpression {
    public static void main(String[] args) {
        String str="1C0C1C1A0B1";//1
        String str2="1B1A1C0";
        String str3="1A0B1C1";
        System.out.println("Answer : "+ calFun(str3));
    }

    public static int calFun(String str){
        int ans=Character.getNumericValue(str.charAt(0));
        int num2=2;

        for (int i = 1; i <str.length() ; i+=2) {
            char ch=str.charAt(i);
            ans=fun(ans,ch,Character.getNumericValue(str.charAt(num2)));
            num2+=2;

        }
        return ans;
    }

    public static int fun(int num1,char ch,int num2){
        if(ch=='C'){
            return (num1 ^ num2);
        }else if(ch=='B'){
            return (num1 | num2);
        }else{
            return (num1 & num2);
        }
    }
}
