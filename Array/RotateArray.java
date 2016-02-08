//189. Rotate Array My Submissions Question
//Total Accepted: 60218 Total Submissions: 296644 Difficulty: Easy
//Rotate an array of n elements to the right by k steps.
//
//For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
//
//Note:
//Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
//
//[show hint]
//
//Hint:
//Could you do it in-place with O(1) extra space?
//Related problem: Reverse Words in a String II
//



public class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        if(len==0)
            return;
        int[] store=new int[len];    
            
        int i,j;
        j=0;
        for(i=0;i<len;i++)
        {
            store[j++]=nums[i];
        }
//        j=k;
        for(i=0;i<len;i++)
        {
           
           j=(i+k)%len; 
           nums[j]=store[i];
        }
        
    }
}