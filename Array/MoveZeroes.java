// 283. Move Zeroes  QuestionEditorial Solution  My Submissions
// Total Accepted: 124405
// Total Submissions: 267053
// Difficulty: Easy
// Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

// Note:
// You must do this in-place without making a copy of the array.
// Minimize the total number of operations.


public class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int i,j;
        int first,last;
        i=j=0;
        
        if(len == 0)
            return ;
        
        first = 0;
        last = len - 1;
        
        while( i < len)
        {
            if(nums[i] != 0)
            {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        
        while(j<len)
        {
            nums[j] = 0;
            j++;
        }
    }
}