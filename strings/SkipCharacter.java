package strings;

public class SkipCharacter {
    public static void main(String[] args) {
        String str="Dipak"; // 'a'  will skip
        System.out.println(skipFun(str,'a',"")); //teh output will be  "Dipk"
    }
    public static String skipFun(String s,char ch,String newStr){
        if(s.isEmpty()){
            return newStr;
        }
        char chVal=s.charAt(0);
        if(ch==chVal){
            return skipFun(s.substring(1),ch,newStr);
        }else{
            return skipFun(s.substring(1),ch,newStr+chVal);
        }
    }
}
