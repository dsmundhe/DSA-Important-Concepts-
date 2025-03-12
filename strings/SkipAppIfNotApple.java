package strings;

public class SkipAppIfNotApple {
    public static void main(String[] args) {
        String str="appipakapplebananaappnnnnnaaa";
        System.out.println("Skiped App : "+ skipApp(str));
    }

    public static String skipApp(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipApp(str.substring(3));
        }else{
            return str.charAt(0)+skipApp(str.substring(1));
        }
    }
}
