// 209. Minimum Size Subarray Sum My Submissions Question
// Total Accepted: 30857 Total Submissions: 118548 Difficulty: Medium
// Given an array of n positive integers and a positive integer s, find the minimal length of a subarray of which the sum ≥ s. If there isn't one, return 0 instead.
//
// For example, given the array [2,3,1,2,4,3] and s = 7,
// the subarray [4,3] has the minimal length under the problem constraint.

public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
       int sum = 0, left = 0, right = 0, minLength = nums.length+1;

        while(true)
        {
            if(sum>=s)
            {
                minLength=Math.min(minLength,right-left);
                sum -=nums[left++];

            }
            else
            {
                if(right==nums.length)break;
                sum+=nums[right++];
            }
        }


       return minLength==nums.length+1?0:minLength;
    }
}
