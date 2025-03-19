package basic_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class MagicNumCost {
    public static void main(String[] args) {
       List<List<Integer>> matrix = new ArrayList<>();

        // Adding rows to the matrix
        matrix.add(new ArrayList<>());
        matrix.get(0).add(4);
        matrix.get(0).add(8);
        matrix.get(0).add(2);

        matrix.add(new ArrayList<>());
        matrix.get(1).add(4);
        matrix.get(1).add(5);
        matrix.get(1).add(7);

        matrix.add(new ArrayList<>());
        matrix.get(2).add(6);
        matrix.get(2).add(1);
        matrix.get(2).add(6);

//        System.out.println("Cost : "+magicCost(matrix));
        magicCost(matrix);

    }
    public static void magicCost(List<List<Integer>> s){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<s.size();i++){
            for (int j = 0; j < s.size(); j++) {
                list.add(s.get(i).get(j));
            }
        }
        Collections.sort(list);
        System.out.println("List : "+list);
        int num=1;
        int sum=0;

        for(int i=0;i<s.size();i++){
            if(!list.get(i).equals(num)){
                int diff=Math.abs(num-list.get(i));
                sum+=diff;
            }
            num++;
        }
        System.out.println(sum);
    }
}
