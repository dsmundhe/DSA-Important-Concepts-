package basic_questions;

public class StudentRank {
    public static void main(String[] args) {
        int[] adi={76,76,66};
        int[] ammu={76,76,76};
        System.out.println(rankDecide(adi,ammu,arrSum(adi),arrSum(ammu)));

    }
    public static String rankDecide(int[] adi,int[] ammu,int adiSum,int ammSum){
        if(ammSum>adiSum){
            return "Ammuu";
        }else if(ammSum<adiSum){
            return "Adddi";
        }
        if(ammSum==adiSum){
            if(adi[0]>ammu[0]){
                return "Adddi";
            }else if(adi[0]<ammu[0]){
                return "Ammuu";
            }else if(adi[0]==ammu[0]){
                if(adi[1]>ammu[1])return "Addi";
                if(adi[1]<ammu[1])return "Ammuu";
                if(adi[1]==ammu[1]){
                    if(adi[2]>ammu[2])return "Addi";
                    if(adi[2]<ammu[2])return "Ammuu";
                    if(adi[2]==ammu[2])return "Ammu  + Addi";
                }

            }
        }
        return "Nooooooo";
    }
    public static int arrSum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
