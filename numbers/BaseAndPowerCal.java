package numbers;

public class BaseAndPowerCal {
    public static void main(String[] args) {
        int base=10;
        int power=5;
        System.out.println("Answer : "+powerFun(base,power));
    }

    public static int powerFun(int base,int power){
       int ans=1;
       while (power >0){
           if((power & 1)==1){
               ans*=base;
           }
           base *=base;
           power=power>>1;
       }
       return ans;
    }
}
