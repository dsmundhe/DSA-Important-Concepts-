package bitwiseOpp;

import java.util.Scanner;

public class NoOfOneInNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num=sc.nextInt();
        System.out.println("The No Of once in "+ num + " This num : "+noOfOnces(num));
    }
    public static int noOfOnces(int num){
        int counter=0;
        while (num > 0){
            if((num & 1)==1){
                counter++;
            }
            num >>= 1;
        }
        return counter;
    }
}
