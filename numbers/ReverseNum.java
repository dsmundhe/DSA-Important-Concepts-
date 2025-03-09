package numbers;

public class ReverseNum {
    public static void main(String[] args) {
        int num=58794;
        int newNum=0;
//        while(num > 0){
//            int rem=num % 10;
//            newNum = rem + newNum * 10;
//            num /=10;
//        }
//        System.out.println(newNum);

         newNum=revNumFun(num,0);
        System.out.println("Original Num : "+ num);
        System.out.println("Reverse Num : "+newNum);
    }
    public static int revNumFun(int num,int rev){
        if(num ==0)return rev;
        int rem=num % 10;
        rev = rem + rev*10;
        return revNumFun(num/10,rev);
    }
}
