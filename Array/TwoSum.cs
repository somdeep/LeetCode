// 1. Two Sum
// Easy

// 10999

// 370

// Favorite

// Share
// Given an array of integers, return indices of the two numbers such that they add up to a specific target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Example:

// Given nums = [2, 7, 11, 15], target = 9,

// Because nums[0] + nums[1] = 2 + 7 = 9
// return [0, 1].

public class Solution {
    public int[] TwoSum (int[] nums, int target) {
        int[] result = new int[2];

        Dictionary<int, int> numbers = new Dictionary<int, int>();
        
        for (int i=0;i<=nums.Length;i++) 
        {
            int num = nums[i];
            if (numbers.ContainsKey(target - num)) 
            {
                result[0] = numbers[target - num];
                result[1] = i;
                break;
            }

            else if(numbers.ContainsKey(num))
            {
                continue;
            }
            else
            {
                numbers.Add(num, i);
            }

        }
        
        
        return result;
    }
}