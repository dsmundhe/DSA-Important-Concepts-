package arrays;

import java.util.*;
public class PrimeNum {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter num  : ");
        int num=sc.nextInt();
        if(isPrimeNum(num)) {
            System.out.println("Prime Num!");
        }else{
            System.out.println("Not Prime Num!");
        }
    }
    public static boolean isPrimeNum(int num){
        int c=2;
        while (c<=num){
            if(num % c==0)return false;
            c++;
        }
        return true;
    }
}
