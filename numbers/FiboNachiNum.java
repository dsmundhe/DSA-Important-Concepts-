package numbers;

import java.io.*;
import java.util.*;

public class FiboNachiNum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int a=0;
        int b=1;
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] nArr=new int[t];
        for(int i=0;i<t;i++){
            nArr[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++){
            b=1;
            a=0;
            for(int j=0;j<nArr[i];j++){
                int temp=a+b;
                a=b;
                b=temp;
            }
            System.out.println(a);
        }

    }
}
