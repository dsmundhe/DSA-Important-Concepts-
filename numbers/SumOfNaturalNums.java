package numbers;

import java.util.Scanner;

public class SumOfNaturalNums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num=sc.nextInt();
        System.out.println("Natural Nums Sum : "+ sum(num));
    }
    public static int sum(int num){
        if(num ==1){
            return 1;
        }
        return (num + sum(num-1));
    }
}
