package numbers;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num=sc.nextInt();
        System.out.println("Sum Of Digits : "+sumOfDigitsFun(num,0));
        System.out.println("Sum of Digits : "+ sum_of_Digits(num));
    }



    public static int sum_of_Digits(int num){
        if(num==0){
            return 0;
        }
        return (num %10 + sum_of_Digits(num /10));
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
