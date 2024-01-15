// 1207. Unique Number of Occurrences
// Solved
// Easy
// Topics
// Companies
// Hint
// Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.



// Example 1:

// Input: arr = [1,2,2,1,1,3]
// Output: true
// Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
// Example 2:

// Input: arr = [1,2]
// Output: false
// Example 3:

// Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
// Output: true


// Constraints:

// 1 <= arr.length <= 1000
// -1000 <= arr[i] <= 1000
// Seen this question in a real interview before?
// 1/4
// Yes
// No
// Accepted
// 405.7K
// Submissions
// 543K
// Acceptance Rate
// 74.7%
// Topics
// Array
// Hash Table

public class Solution
{
    public bool UniqueOccurrences(int[] arr)
    {
        Dictionary<int, int> occur = new Dictionary<int, int>();

        foreach (int num in arr)
        {
            if (occur.TryAdd(num, 1) == false) occur[num]++;
        }

        HashSet<int> result = new HashSet<int>();
        foreach (int num in occur.Values)
        {
            if (result.Contains(num)) return false;
            result.Add(num);

        }

        return true;
    }
}