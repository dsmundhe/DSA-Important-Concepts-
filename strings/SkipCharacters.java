package strings;

public class SkipCharacters {
    public static void main(String[] args) {
        String s=new String("aaaaabcdeffff");
        System.out.println(skipCharFun(s));
    }

    public static String skipCharFun(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.length()==1)return str;

        if(str.charAt(0) != str.charAt(1)){
            return str.charAt(0) + skipCharFun(str.substring(1));
        }else{
            return skipCharFun(str.substring(1));
        }
    }


}
