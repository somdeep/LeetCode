// 26. Remove Duplicates from Sorted Array   QuestionEditorial Solution  My Submissions
// Total Accepted: 169724
// Total Submissions: 485998
// Difficulty: Easy
// Contributors: Admin
// Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

// Do not allocate extra space for another array, you must do this in place with constant memory.

// For example,
// Given input array nums = [1,1,2],

// Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.

// Subscribe to see which companies asked this question

// Hide Tags Array Two Pointers
// Show Similar Problems


public class Solution {
  public int removeDuplicates(int[] nums) 
   {
       int len = nums.length;
       if(len == 0)
            return 0;
        if(len == 1)
            return 1;
         int result = 0;
         int i,j;
         i=0;
         j=1;
          int temp;
         while(i<len && j<len)
         {
           if(nums[i] == nums[j])
           {
             j++;
           }
           
           else
           {
             i++;
             nums[i]=nums[j];
             j++;
             
           }
           
         }
     
     return ++i;
     
     
     
   }
}