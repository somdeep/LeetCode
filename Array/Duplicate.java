//219. Contains Duplicate II My Submissions Question
//Total Accepted: 39136 Total Submissions: 138767 Difficulty: Easy
//Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
//
//Subscribe to see which companies asked this question
//
//Hide Tags Array Hash Table
//Show Similar Problems
//Have you met this question in a real interview? Yes  No
//Discuss
//
//
//
//
//1
//2
//3
//4
//5

import java.util.*;


public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
                
        if(nums.length==0)
        return false;
        
        int i,j;
        int val;
        int pos;
        int diff;
        Hashtable<Integer,Integer> h= new Hashtable<Integer,Integer>(nums.length);

        for(i=0;i<nums.length;i++)
        {
            val=nums[i];
            
            if(h.containsKey(val))
            {
                pos=h.get(val);
                diff= i-pos;
                
                if(diff<=k)
                    return true;
                else
                    h.put(nums[i],i);
            }
            else
            {
                h.put(nums[i],i);
            }
            
        }
        
        return false;
        
    }
}