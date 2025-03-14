package Lambda_Functions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFun {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        //Normal Fun
        System.out.println("Sum : "+ sum(a,b));

        //Lambda Fun
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //Lambda function in forEach Loop
        list.forEach((items)->{
            System.out.println(items);
        });


        //Create Consumer
        Consumer<Integer> fun= (items)->{
            System.out.println("Num : "+items);
        };

        list.forEach(fun);

    }
    public static int sum(int a,int b){
        return a+b;
    }
}
