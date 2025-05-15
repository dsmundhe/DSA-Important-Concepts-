package Stack.Questions;
import java.util.Arrays;
import java.util.Stack;

public class MostCompetitiveSubSequence {
    public static void main(String[] args) {
      int[] nums={3,5,2,6};
        System.out.println(Arrays.toString(competitiveSub(nums,2)));
    }

    public static int[] competitiveSub(int[] nums,int k){
        Stack<Integer> stack=new Stack<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            while (!stack.isEmpty() && nums[i]<stack.peek()&& (stack.size() + (n-i))>k){
                stack.pop();
            }
            if(stack.size()<k){
                stack.push(nums[i]);
            }
        }

        int[] result=new int[k];
        for(int i=k-1;i>=0;i--){
            result[i]=stack.pop();
        }
        return result;
    }

}
