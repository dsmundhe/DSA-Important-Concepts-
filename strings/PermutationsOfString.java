package strings;

import java.util.ArrayList;

public class PermutationsOfString {
    public static void main(String[] args) {
        String str="ABC";
        permuFun("",str);

        System.out.println(permFunList("",str));
    }


    public static ArrayList permFunList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> ls=new ArrayList<>();
            ls.add(p);
            return ls;
        }
        char ch=up.charAt(0);
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            list.addAll(permFunList(f+ch+s,up.substring(1)));
        }
        return list;
    }


    public static void permuFun(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permuFun(f+ch+s,up.substring(1));
        }
    }
}
