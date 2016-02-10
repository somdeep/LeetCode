// 238. Product of Array Except Self My Submissions Question
// Total Accepted: 33176 Total Submissions: 80700 Difficulty: Medium
// Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
//
// Solve it without division and in O(n).
//
// For example, given [1,2,3,4], return [24,12,8,6].
//
// Follow up:
// Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int l = 1;
        int r = 1;
        for(int j = 0;j<result.length;j++) {
            result[j] = 1;
        }
        for(int i = 0;i<nums.length-1;i++) {
            l *= nums[i];
            int rIndex = nums.length - i - 1;
            r *= nums[rIndex];
            result[i+1] *= l;
            result[rIndex -1] *= r;
        }

        return result;
    }
}
