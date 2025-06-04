package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class PermutationString {
    public static void main(String[] args) {
//        String str=new String("ABC");
//        System.out.println(combFun(str,""));

        ArrayList<String> result = combFun("", "fedcbabcd");
        Collections.sort(result);
        System.out.println(result);

        System.out.println(result.indexOf("fedcbabcd"));
        System.out.println(result.size());
        if(result.get(result.size()-1).equals("fedcbabcd")){
            System.out.println("No result! for fedcbabcd");
        }
        if(result.indexOf("bb")==result.size()-1){
            System.out.println("No result");
        }


    }


    //direct print
    public static ArrayList<String> combFun(String p, String up) {
        ArrayList<String> result = new ArrayList<>();

        if (up.isEmpty()) {
            result.add(p);
            return result;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            result.addAll(combFun(f + ch + s, up.substring(1)));
        }

        return result;
    }


}
