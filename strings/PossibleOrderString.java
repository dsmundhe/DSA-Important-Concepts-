package strings;

import java.util.ArrayList;

public class PossibleOrderString {
    public static void main(String[] args) {
        String str=new String("abc");
        System.out.println(orderFun(str));
    }
    public static ArrayList orderFun(String str){
        ArrayList<String> list=new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                list.add(str.substring(i,j));
            }
        }
        return list;
    }
}
