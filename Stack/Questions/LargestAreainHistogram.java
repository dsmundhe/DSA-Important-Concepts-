package Stack.Questions;

public class LargestAreainHistogram {
    public static void main(String[] args) {
        int[] histgram={4};
        int sum=0;
        for(int i=0;i<histgram.length;i++){
            int leftSum=backword(histgram,histgram[i],i);
            int rightSum=forward(histgram,histgram[i],i);
            if((leftSum+rightSum)>sum){
                sum=(rightSum+leftSum);
            }
        }
        System.out.println("Largest Triangle : "+ sum);


    }
    public static int backword(int[] arr,int val,int index){
        int sum=0;
        if(index==0)return sum;
        while (index !=0){
            index--;
            if(arr[index]>=val){
                sum+=val;
            }else break;
        }
        return  sum;
    }
    public static int forward(int[] arr,int val,int index){
    int sum=0;
    if(index==0 || index==arr.length)return 0;
        while (index !=arr.length){
            if(arr[index]>=val){
                sum+=val;
            }else break;
            index++;
        }
        return sum;
    }
}
