package Recursion;

import java.util.ArrayList;
import java.util.List;

public class DiceProblem {
    public static void main(String[] args) {
//            dice("",9);
    //List
//        List<Integer>list=new ArrayList<>();
//        list.add(2);
//        list.add(3);
//        list.add(6);
//        list.add(7);
//        System.out.println("List : "+combDice("",7,list));

        //dice problem
        combFun("",5);


    }


    //through list
    public static List combDice(String p,int target,List vals){
        if(target==0){
            List<String> ls=new ArrayList<>();
            ls.add(p);
            return ls;
        }
        List<String> list=new ArrayList<>();
        for (int i = 1; i <=target ; i++) {
            if(vals.contains(i)){
                list.addAll(combDice(p+i,target-i,vals));
            }
        }
        return list;
    }

   public static void combFun(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
       for (int i = 1; i <=target && i<=6 ; i++) {
           combFun(p+i,target-i);
       }
   }
}
