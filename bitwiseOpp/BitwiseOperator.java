package bitwiseOpp;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num=sc.nextInt();

        //Is even Num
//        System.out.println("Is Even Num : "+ isEvenNum(num));

        //Left shift Operator
        System.out.println("Left shift for " + num + " : " + leftShift(num));

        //right shift operator
        System.out.println("Rightshift For "+num +" : "+rightShift(num));

        //unsigned rightshift operator
        System.out.println("Unsignde Rightshift For "+num+" : "+unsignedRightShift(num));
    }

    //Is Even Num function
    public static boolean isEvenNum(int num){
       return (num  & 1)==0;
    }

    //Left shift Operator add one bit at last
    //Multiplies  num by 2^n where n is left shift val
    public static int leftShift(int num){
        return num <<1;
    }

    //signed right shift operator remove last bit
    //divide num by 2^n  where n right shift val;
    public static int rightShift(int num){
        return num >> 1;
    }

    //unsigned right shift operator
    //same as right shift just only add 0s at leftmost side for both positive and Negative numbers;
    public static int unsignedRightShift(int num){
        return num >>> 1;
    }
}
