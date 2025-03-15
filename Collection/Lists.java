package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Lists {
    public static void main(String[] args) {
        //ArrayList

        ArrayList<Integer> listInt=new ArrayList<>();
        listInt.add(10);
        listInt.add(20);
        listInt.add(30);
        listInt.add(40);
        System.out.println("Integer List : " +listInt);


        ArrayList<String> listStr=new ArrayList<>();
        listStr.add("Dipak");
        listStr.add("Samadhan");
        listStr.add("Mundhe");
        System.out.println("String List : "+ listStr);

        List<Character> listChar=new ArrayList<>();
        listChar.add('D');
        listChar.add('I');
        listChar.add('P');
        listChar.add('A');
        listChar.add('K');
        System.out.println("Char List : "+ listChar);

        //Vector
        Vector<Integer> vector=new Vector<>();
        vector.add(50);
        vector.add(60);
        vector.remove(0);
        System.out.println("Vector : "+ vector);


        //Disinct arr
        int[] arr={1,1,2,2,4,4,3,3,5,5};
        int[] unique= Arrays.stream(arr).distinct().toArray();
        System.out.println("Before : "+Arrays.toString(arr));
        System.out.println("After : "+Arrays.toString(unique));
    }
}
