// 347. Top K Frequent Elements
// Medium
// 13.1K
// 479
// company
// Amazon
// company
// Bloomberg
// company
// Google
// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.



// Example 1:

// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]
// Example 2:

// Input: nums = [1], k = 1
// Output: [1]


// Constraints:

// 1 <= nums.length <= 105
// -104 <= nums[i] <= 104
// k is in the range [1, the number of unique elements in the array].
// It is guaranteed that the answer is unique.


// Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.

// Accepted
// 1.4M
// Submissions
// 2.1M
// Acceptance Rate
// 64.2%

using System.Collections.Generic;

public class Solution
{
    public int[] TopKFrequent(int[] nums, int k)
    {
        Dictionary<int, int> map = new Dictionary<int, int>();

        foreach (int num in nums)
        {
            if (!map.ContainsKey(num)) map[num] = 0;
            map[num]++;
        }

        PriorityQueue<int, int> pq = new PriorityQueue<int, int>();

        foreach (var item in map)
        {
            int num = item.Key;
            int freq = item.Value;

            pq.Enqueue(num, freq);
            if (pq.Count > k) pq.Dequeue();
        }

        int[] result = new int[k];
        int count = 0;
        while (count < k) result[count++] = pq.Dequeue();

        return result;
    }
}