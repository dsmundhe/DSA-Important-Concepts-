package numbers;

import java.util.Scanner;

public class PrimeNumCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num : ");
        int num=sc.nextInt();
        if(isPrime(num,2)){
            System.out.println("This is Prime Num !");
        }else{
            System.out.println("Not Prime Num !");
        }

    }
    public static boolean isPrime(int num,int count){
        if(count >= num){
            return true;
        }
        if(num % count==0){
            return false;
        }
        return isPrime(num,count+1);
    }
}
