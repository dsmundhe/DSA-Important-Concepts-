package numbers;

public class FactorialOfNum {
    public static void main(String[] args) {
        int num=3;
        System.out.println(factoFun(num));
    }
    public static int factoFun(int num){
        if(num <=1){
            return num;
        }
        return num * factoFun(num-1);
    }
}
