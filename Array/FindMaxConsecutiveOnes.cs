// 87. Max Consecutive Ones II
// Medium
// 1.4K
// 22
// company
// Google
// company
// Yandex
// company
// Zoom
// Given a binary array nums, return the maximum number of consecutive 1's in the array if you can flip at most one 0.



// Example 1:

// Input: nums = [1,0,1,1,0]
// Output: 4
// Explanation: 
// - If we flip the first zero, nums becomes [1,1,1,1,0] and we have 4 consecutive ones.
// - If we flip the second zero, nums becomes [1,0,1,1,1] and we have 3 consecutive ones.
// The max number of consecutive ones is 4.
// Example 2:

// Input: nums = [1,0,1,1,0,1]
// Output: 4
// Explanation: 
// - If we flip the first zero, nums becomes [1,1,1,1,0,1] and we have 4 consecutive ones.
// - If we flip the second zero, nums becomes [1,0,1,1,1,1] and we have 4 consecutive ones.
// The max number of consecutive ones is 4.


// Constraints:

// 1 <= nums.length <= 105
// nums[i] is either 0 or 1.


// Follow up: What if the input numbers come in one by one as an infinite stream? In other words, you can't store all numbers coming from the stream as it's too large to hold in memory. Could you solve it efficiently?

// Accepted
// 120K
// Submissions
// 241.7K
// Acceptance Rate
// 49.6%

using System;

public class Solution
{
    public int FindMaxConsecutiveOnes(int[] nums)
    {
        int longestSequence = 0;
        int left = 0;
        int right = 0;
        int numZeroes = 0;

        while (right < nums.Length)
        {
            if (nums[right] == 0)
                numZeroes++;

            while (numZeroes == 2)
            {
                if (nums[left] == 0)
                    numZeroes--;
                left++;
            }

            longestSequence = Math.Max(longestSequence, right - left + 1);
            right++;
        }

        return longestSequence;
    }
}