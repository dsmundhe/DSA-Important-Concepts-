package numbers;

import java.util.Arrays;

public class MajorityElementNum {
    public static void main(String[] args) {
        int[] arr={10,20,20,20,30,30,40,40,50,50,60,60};
        System.out.println(findMajorityElement(arr));

    }

    public static int findMajorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2]; // Majority element will be in the middle
    }
}
