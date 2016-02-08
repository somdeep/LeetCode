//26. Remove Duplicates from Sorted Array My Submissions Question
//Total Accepted: 110387 Total Submissions: 337936 Difficulty: Easy
//Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
//
//Do not allocate extra space for another array, you must do this in place with constant memory.
//
//For example,
//Given input array nums = [1,1,2],
//
//Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.


public class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
    
        if(len==0)
            return 0;
            
        int i,j;
        j=0;
        for(i=1;i<len;i++)
        {
            if(nums[i]!=nums[j])
            {
                j++;
                nums[j]=nums[i];
            }
        }
        
        return j+1;
    }
}