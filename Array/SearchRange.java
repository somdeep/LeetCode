//34. Search for a Range My Submissions Question
//Total Accepted: 77172 Total Submissions: 267558 Difficulty: Medium
//Given a sorted array of integers, find the starting and ending position of a given target value.
//
//Your algorithm's runtime complexity must be in the order of O(log n).
//
//If the target is not found in the array, return [-1, -1].
//
//For example,
//Given [5, 7, 7, 8, 8, 10] and target value 8,
//return [3, 4].

public class Solution {
    
    int a[]={-1,-1};
    public int[] searchRange(int[] nums, int target) {
        int len=nums.length;
        
        if(len==0)
            return null;
        // a[0]=-1;
        // a[1]=-1;
        int upper,lower;
        
        upper=len-1;
        lower=0;
    
        //int pivot=upper/lower;
        
        int x = binary(nums,lower,upper,target);
        
        //System.out.println(x);
        
        return a;
        
    }
    public int binary(int[] nums,int lower,int upper,int target)
    {
        int pivot=(upper-lower)/2 + lower;
      //  System.out.println("Pivot : " + nums[pivot] );
        
        if(nums[pivot]==target)
        { 
            if(a[0]==-1)
                a[0]=pivot;
                
            if(pivot<a[0])
                a[0]=pivot;
            if(pivot>a[1])
                a[1]=pivot;
                
                
              if(lower>=upper)
            return -1;
                
             binary(nums,lower,pivot-1,target);
             binary(nums,pivot+1,upper,target);
             return 0;
        }
        if(lower>=upper)
            return -1;
            
        if(nums[pivot]>target)
        {
          //  System.out.println("in here");
            
            return binary(nums,lower,pivot-1,target);
            
        }
            
        else
            return binary(nums,pivot+1,upper,target);    
        
        
    
        
        
    }
}