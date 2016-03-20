//136. Single Number My Submissions Question
//Total Accepted: 119993 Total Submissions: 244257 Difficulty: Medium
//Given an array of integers, every element appears twice except for one. Find that single one.
//
//Note:
//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

    
    
    public class Solution {
    public int singleNumber(int[] nums) {
     
        int len=nums.length;
        
        if(len == 0)
            return 0;
            
            
        int i,j;
        
        int val=0;
        
        for(i=0;i<len;i++)
        {
            val=val ^ nums[i];
            
        }
        
        
        return val;
        
        
        
        
        
        
        
     
        
    }
}