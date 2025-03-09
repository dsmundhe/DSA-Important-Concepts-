package numbers;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num=sc.nextInt();
        System.out.println("Sum Of Digits : "+sumOfDigitsFun(num,0));
    }
    public static int sumOfDigitsFun(int num,int sum){
        if(num ==0){
            return sum;
        }
        int rem=num %10;
        sum +=rem;
        return sumOfDigitsFun(num /10,sum);

    }
}
