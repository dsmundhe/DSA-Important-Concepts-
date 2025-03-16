package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsGoogleQue {
    public static void main(String[] args) {
        String str="02";

//        combFun("",str);
//        System.out.println("List : "+combFunList("",str));

        //after handling edge cases;
        //starts from 2
//        combPad("","29");

        //Print List
//        System.out.println("List : "+ combPadList("",str));

        combinationsFun("","23");
    }

    //for actual pad returning in list
    public static List combPadList(String p,String up){
        if(up.isEmpty()){
            List<String>ls=new ArrayList<>();
            ls.add(p);
            return ls;
        }
        int digit=Character.getNumericValue(up.charAt(0));
        String[] mapping={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String letters=mapping[digit];
        List<String> list=new ArrayList<>();
        if(digit==0 || digit==1){
            list.addAll(combPadList(p,up.substring(1)));
        }else{
            for(char ch:letters.toCharArray()){
                list.addAll(combPadList(p+ch,up.substring(1)));
            }
        }
        return list;
    }

    //for actual pad
    public static void combinationsFun(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        String[] mapping={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wzyz"};
        String[] mappingList={"abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
        int digit=Character.getNumericValue(up.charAt(0));
        String letters=mappingList[digit];
        for(char ch:letters.toCharArray()){
            combinationsFun(p+ch,up.substring(1));
        }
    }

    //return in List
    public static List combFunList(String p, String up){
        if(up.isEmpty()){
            List<String> ls=new ArrayList<>();
            ls.add(p);
            return ls;
        }
        int digit=(int) (up.charAt(0)-'0');
        int digit1=Character.getNumericValue(up.charAt(0));

        List<String> list=new ArrayList<>();
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch=(char) ('a'+i);
           list.addAll(combFunList(p+ch,up.substring(1)));
        }
        return list;

    }

    public static void combFun(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=(int) up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char) ('a'+i);
            combFun(p+ch,up.substring(1));
        }

    }
}
