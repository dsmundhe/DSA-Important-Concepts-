package strings;

public class SkipApple {
    public static void main(String[] args) {
        String str="appledipakappleapple";
        System.out.println(skipApple(str));
    }
    public static String skipApple(String str){
        if(str.isEmpty())return "";
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }else{
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }
}
