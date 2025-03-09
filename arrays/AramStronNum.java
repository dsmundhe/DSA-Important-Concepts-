package arrays;

public class AramStronNum {
    public static void main(String[] args) {
        int num=153;
         if(isArmStrong(num)){
             System.out.println(num + " This is an Armstrong Num !");
         }else{
             System.out.println(num + " This not ArmStrong Num !");
         }
    }
    public static boolean isArmStrong(int num){
        int sum=0;
        int orgNum=num;
        while(num > 0){
            int rem=num % 10;
            int val=(int) Math.pow(rem,3);
            sum +=val;
            num /=10;
        }
         return orgNum==sum;

    }
}
