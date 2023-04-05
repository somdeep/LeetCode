// 599. Minimum Index Sum of Two Lists
// Easy
// 1.7K
// 373
// company
// Yelp
// Given two arrays of strings list1 and list2, find the common strings with the least index sum.

// A common string is a string that appeared in both list1 and list2.

// A common string with the least index sum is a common string such that if it appeared at list1[i] and list2[j] then i + j should be the minimum value among all the other common strings.

// Return all the common strings with the least index sum. Return the answer in any order.



// Example 1:

// Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]
// Output: ["Shogun"]
// Explanation: The only common string is "Shogun".
// Example 2:

// Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["KFC","Shogun","Burger King"]
// Output: ["Shogun"]
// Explanation: The common string with the least index sum is "Shogun" with index sum = (0 + 1) = 1.
// Example 3:

// Input: list1 = ["happy","sad","good"], list2 = ["sad","happy","good"]
// Output: ["sad","happy"]
// Explanation: There are three common strings:
// "happy" with index sum = (0 + 1) = 1.
// "sad" with index sum = (1 + 0) = 1.
// "good" with index sum = (2 + 2) = 4.
// The strings with the least index sum are "sad" and "happy".


// Constraints:

// 1 <= list1.length, list2.length <= 1000
// 1 <= list1[i].length, list2[i].length <= 30
// list1[i] and list2[i] consist of spaces ' ' and English letters.
// All the strings of list1 are unique.
// All the strings of list2 are unique.
// There is at least a common string between list1 and list2.
// Accepted
// 186.9K
// Submissions
// 350.1K
// Acceptance Rate
// 53.4%

using System.Collections.Generic;
using System.Linq;

public class Solution
{
    public string[] FindRestaurant(string[] list1, string[] list2)
    {
        Dictionary<string, int> map = new Dictionary<string, int>();
        Dictionary<int, List<string>> result = new Dictionary<int, List<string>>();

        for (int i = 0; i < list1.Length; i++)
        {
            if (!map.ContainsKey(list1[i])) map[list1[i]] = 0;
            map[list1[i]] += i;
        }

        for (int i = 0; i < list2.Length; i++)
        {
            if (!map.ContainsKey(list2[i])) map[list2[i]] = 0;

            else
            {
                map[list2[i]] += i;
                if (!result.ContainsKey(map[list2[i]])) result.Add(map[list2[i]], new List<string>());
                result[map[list2[i]]].Add(list2[i]);
            }
        }

        int min = result.Keys.Min();
        return result[min].ToArray();
    }
}