// 170.Two Sum III - Data structure design
// Easy
// 630
// 421
// company
// LinkedIn
// Design a data structure that accepts a stream of integers and checks if it has a pair of integers that sum up to a particular value.

// Implement the TwoSum class:

// TwoSum() Initializes the TwoSum object, with an empty array initially.
// void add(int number) Adds number to the data structure.
// boolean find(int value) Returns true if there exists any pair of numbers whose sum is equal to value, otherwise, it returns false.



// Example 1:

// Input
// ["TwoSum", "add", "add", "add", "find", "find"]
// [[], [1], [3], [5], [4], [7]]
// Output
// [null, null, null, null, true, false]

// Explanation
// TwoSum twoSum = new TwoSum();
// twoSum.add(1);   // [] --> [1]
// twoSum.add(3);   // [1] --> [1,3]
// twoSum.add(5);   // [1,3] --> [1,3,5]
// twoSum.find(4);  // 1 + 3 = 4, return true
// twoSum.find(7);  // No two integers sum up to 7, return false


// Constraints:

// -105 <= number <= 105
// - 231 <= value <= 231 - 1
// At most 104 calls will be made to add and find.
// Accepted
// 140.6K
// Submissions
// 375.9K
// Acceptance Rate
// 37.4%

using System.Collections.Generic;

public class TwoSum
{
    public Dictionary<int, int> map;

    public TwoSum()
    {
        map = new Dictionary<int, int>();
    }

    public void Add(int number)
    {
        if (!map.ContainsKey(number)) map[number] = 0;
        map[number]++;
    }

    public bool Find(int value)
    {
        foreach (var entry in map)
        {
            int complement = value - entry.Key;

            if (complement != entry.Key)
            {
                if (map.ContainsKey(complement)) return true;
            }
            else if (entry.Value > 1) return true;

        }

        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.Add(number);
 * bool param_2 = obj.Find(value);
 */