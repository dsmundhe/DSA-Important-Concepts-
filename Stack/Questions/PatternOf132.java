package Stack.Questions;

import java.util.Stack;

public class PatternOf132 {
    public static void main(String[] args) {
        int[] nums1={1,2,3,4};
        int[] nums2={3,1,4,2};
        int[] nums3={-1,3,2,0};
        System.out.println(find132pattern(nums1));
        System.out.println(find132pattern(nums2));
        System.out.println(find132pattern(nums3));

    }

    public static boolean find132pattern(int[] nums) {
        if (nums.length <= 2) {
            return false;
        }
        int start = 0;
        while (start < nums.length) {
            Stack<Integer> stack = new Stack<>();
            stack.push(nums[start]);
            int count = start + 1;
            boolean isKadded = false;
            while (stack.size() < 3 && count < nums.length) {
                if (!isKadded) {
                    if (stack.peek() < nums[count]) {
                        stack.push(nums[count]);
                        isKadded=true;
                    }
                } else {
                    if (stack.peek() > nums[count]) {
                        stack.push(nums[count]);
                    }
                }
                count++;
            }
            if(stack.size()==3){
                if (isValid(stack)) {
                    return true;
                }
            }
            start++;
        }
        return false;


    }

    public static boolean isValid(Stack<Integer> stack) {
        int numk = stack.pop();
        int numj = stack.pop();
        int numi = stack.pop();

        return numi < numk && numk < numj;
    }

}
