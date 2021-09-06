// 1662. Check If Two String Arrays are Equivalent
// Easy

// 499

// 97

// Add to List

// Share
// Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

// A string is represented by an array if the array elements concatenated in order forms the string.



// Example 1:

// Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
// Output: true
// Explanation:
// word1 represents string "ab" + "c" -> "abc"
// word2 represents string "a" + "bc" -> "abc"
// The strings are the same, so return true.
// Example 2:

// Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
// Output: false
// Example 3:

// Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
// Output: true


// Constraints:

// 1 <= word1.length, word2.length <= 103
// 1 <= word1[i].length, word2[i].length <= 103
// 1 <= sum(word1[i].length), sum(word2[i].length) <= 103
// word1[i] and word2[i] consist of lowercase letters.

using System.Collections.Generic;
public class Solution
{

    public bool ArrayStringsAreEqual(string[] word1, string[] word2)
    {
        Queue<char> letters = new Queue<char>();

        foreach (string word in word1)
        {
            foreach (char letter in word)
            {
                letters.Enqueue(letter);
            }
        }

        foreach (string word in word2)
        {
            foreach (char letter in word)
            {
                if (letters.Count <= 0) return false;

                char stackLetter = letters.Dequeue();
                if (stackLetter != letter) return false;
            }
        }

        if (letters.Count > 0) return false;

        return true;
    }
}