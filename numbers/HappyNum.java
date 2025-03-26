package numbers;

import java.util.Scanner;

public class HappyNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num  : ");
        int num =sc.nextInt();

        if(isHappyNum(num)){
            System.out.println(num  + " This num is Happy Num!");
        }else{
            System.out.println(num + " This num is NOt Happy Num!");
        }
    }

    public static boolean isHappyNum(int num){
         int first=num;
         int second=num;
         do{
             first=findSquare(first);
             second=findSquare(findSquare(second));
         }
         while (first !=second);
         if(first==1){
             return true;
         }
         return false;
    }

    public static int findSquare(int num){
        int seq=0;
        while(num !=0){
            int rem=num %10;
            seq += rem * rem;
            num /=10;
        }
        return seq;
    }
}
