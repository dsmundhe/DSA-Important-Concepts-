package strings;

import java.util.ArrayList;

public class SubsetOfString {
    public static void main(String[] args) {
        String str="abc";

//        subSetFun("",str);

        System.out.println(subSetFunList("",str));
        subSetFun1("","123");


    }
    public static void subSetFun1(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        subSetFun1(p+up.charAt(0),up.substring(1));
        subSetFun1(p,up.substring(1));
    }


    public static ArrayList subSetFunList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ls=new ArrayList<>();
            ls.add(p);
            return ls;
        }
        ArrayList<String> list=new ArrayList<>();
//        list.addAll(subSetFunList(p+up.charAt(0),up.substring(1)));
//        list.addAll(subSetFunList(p,up.substring(1)));
        //        return list;

        //Another way
        ArrayList<String> left=subSetFunList(p+up.charAt(0),up.substring(1));
        ArrayList<String>right=subSetFunList(p,up.substring(1));
        left.addAll(right);
        return left;

    }

    public static void subSetFun(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subSetFun(p+ch,up.substring(1));
        subSetFun(p,up.substring(1));
    }
}
