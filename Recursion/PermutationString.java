package Recursion;

import java.util.ArrayList;

public class PermutationString {
    public static void main(String[] args) {
        String str=new String("ABC");
        System.out.println(combFun(str,""));

        combPrint("","ABC");

    }

    public static ArrayList combFun(String ph,String p){
        if(ph.isEmpty()){
            ArrayList<String>ls=new ArrayList<>();
            ls.add(p);
            return ls;
        }
        ArrayList<String> list=new ArrayList<>();
        char ch=ph.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String s=p.substring(0,i);
            String f=p.substring(i,p.length());
            list.addAll(combFun(ph.substring(1),f+ch+s));
        }
        return list;

    }


    //direct print
    public static void combPrint(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <= p.length() ; i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            combPrint(f+ch+s,up.substring(1));
        }
    }

}
