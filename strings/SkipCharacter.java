package strings;

public class SkipCharacter {
    public static void main(String[] args) {
        String str="Dipak"; // 'a'  will skip
        System.out.println(skipFun(str,'a',"")); //teh output will be  "Dipk"
        System.out.println(skip(str));
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


    public static String skip(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch=str.charAt(0);
        if(ch=='a'){
            return skip(str.substring(1));
        }else{
            return ch+skip(str.substring(1));
        }
    }
}
