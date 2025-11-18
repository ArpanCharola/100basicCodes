package DSA;
import java.util.*;

class majorityElement {
    public int findMajorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
    public static void main(String args[]){
        int nums[] = { 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        majorityElement mj = new majorityElement();
        int res = mj.findMajorityElement(nums);
        System.out.println("Majority Element in array is:" + res);
    }
}
