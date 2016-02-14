// 78. Subsets My Submissions Question
// Total Accepted: 83842 Total Submissions: 275557 Difficulty: Medium
// Given a set of distinct integers, nums, return all possible subsets.

// Note:
// Elements in a subset must be in non-descending order.
// The solution set must not contain duplicate subsets.
// For example,
// If nums = [1,2,3], a solution is:

// [
// [3],
// [1],
// [2],
// [1,2,3],
// [1,3],
// [2,3],
// [1,2],
// []
// ]


import java.util.*;
public class Solution {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		Arrays.sort(nums);
		
		
		
		for(int i:nums)
		{   
			if(list.isEmpty())
			{
				List<Integer> line = new ArrayList();
				line.add(i);
				list.add(line);
			}
			
			else
			{
				int size = list.size();
				for(int j=0;j<size;j++)
				{
                   List<Integer> temp = new ArrayList<>(list.get(j)); // based on exist list
                    temp.add(i); // add value to each list
                    list.add(temp);
                }
                List<Integer> line = new ArrayList();
                line.add(i);
                list.add(line);
                
                
            }
            
        }
        
        list.add(new ArrayList<Integer>());
        
        return list;
    }
}