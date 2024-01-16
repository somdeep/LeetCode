// 28. Find the Index of the First Occurrence in a String
// Solved
// Easy
// Topics
// Companies
// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



// Example 1:

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// Example 2:

// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.


// Constraints:

// 1 <= haystack.length, needle.length <= 104
// haystack and needle consist of only lowercase English characters.

public class Solution
{
    public int StrStr(string haystack, string needle)
    {
        int hlen = haystack.Length;
        int nlen = needle.Length;

        if (nlen > hlen) return -1;

        int h = 0;
        int n = 0;
        int first = -1;
        int previous = 0;

        while (h < hlen && n < nlen)
        {
            var x = haystack[h];
            var y = needle[n];
            if (haystack[h] == needle[n])
            {
                if (first == -1) first = h;
                h++;
                n++;
            }
            else
            {
                h = previous + 1;
                previous = h;
                first = -1;
                n = 0;
            }

            if (n == nlen && first != -1) return first;
        }

        return -1;
    }
}