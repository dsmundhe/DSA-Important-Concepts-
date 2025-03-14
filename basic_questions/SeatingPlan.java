package basic_questions;

public class SeatingPlan {
    public static void main(String[] args){
        int num=17;
        int count=0;
        int posNum=0;

        for (int i = 1; i <=100; i++) {
            if(isValidNum(i)){
                count++;
            }
            if(count==num){
                posNum=i;
                break;
            }
        }
        System.out.println("Possible "+ num +  "th no seating plan  : " + decToBinary(posNum));

    }
    public static String decToBinary(int num){
        String ans="";
        while (num !=0){
            int rem=num %2;
            ans+=rem;
            num/=2;
        }
        String res="";
        for (int i = ans.length()-1; i >=0 ; i--) {
            res+=ans.charAt(i);
        }
        return res;
    }

    public static boolean isValidNum(int num){
        int prevBit=0;
        while (num !=0){
            int bit=(num & 1);
            if(bit==1 && prevBit==1){
                return  false;
            }
            prevBit=bit;
            num=num >>1;
        }
        return true;
    }
}
