// 1512. Number of Good Pairs
// Easy

// 227

// 12

// Add to List

// Share
// Given an array of integers nums.

// A pair (i,j) is called good if nums[i] == nums[j] and i < j.

// Return the number of good pairs.



// Example 1:

// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
// Example 2:

// Input: nums = [1,1,1,1]
// Output: 6
// Explanation: Each pair in the array are good.
// Example 3:

// Input: nums = [1,2,3]
// Output: 0


// Constraints:

// 1 <= nums.length <= 100
// 1 <= nums[i] <= 100
public class Solution
{
    public int NumIdenticalPairs(int[] nums)
    {
        int i = 0;
        int j = 0;
        int pairs = 0;

        for (i = 0; i < nums.Length - 1; i++)
        {
            for (j = i + 1; j < nums.Length; j++)
            {
                if (nums[i] == nums[j])
                {
                    pairs++;
                }
            }
        }

        return pairs;

    }
}