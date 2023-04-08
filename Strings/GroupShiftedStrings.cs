// 249. Group Shifted Strings
// Medium
// 1.5K
// 289
// company
// Facebook
// company
// Amazon
// company
// Google
// We can shift a string by shifting each of its letters to its successive letter.

// For example, "abc" can be shifted to be "bcd".
// We can keep shifting the string to form a sequence.

// For example, we can keep shifting "abc" to form the sequence: "abc" -> "bcd" -> ... -> "xyz".
// Given an array of strings strings, group all strings[i] that belong to the same shifting sequence. You may return the answer in any order.



// Example 1:

// Input: strings = ["abc","bcd","acef","xyz","az","ba","a","z"]
// Output: [["acef"],["a","z"],["abc","bcd","xyz"],["az","ba"]]
// Example 2:

// Input: strings = ["a"]
// Output: [["a"]]


// Constraints:

// 1 <= strings.length <= 200
// 1 <= strings[i].length <= 50
// strings[i] consists of lowercase English letters.
// Accepted
// 189.9K
// Submissions
// 295.2K
// Acceptance Rate
// 64.3%

using System.Collections.Generic;
using System.Text;

public class Solution
{
    public IList<IList<string>> GroupStrings(string[] strings)
    {
        Dictionary<string, List<string>> map = new Dictionary<string, List<string>>();

        foreach (string str in strings)
        {
            string hashkey = getHash(str);
            if (!map.ContainsKey(hashkey)) map[hashkey] = new List<string>();
            map[hashkey].Add(str);
        }

        IList<IList<string>> result = new List<IList<string>>();
        foreach (var value in map.Values)
        {
            result.Add(value);
        }

        return result;
    }

    public string getHash(string s)
    {
        StringBuilder hashkey = new StringBuilder();

        for (int i = 1; i < s.Length; i++)
        {
            hashkey.Append((char)((s[i] - s[i - 1] + 26) % 26 + 'a'));
        }

        return hashkey.ToString();
    }
}