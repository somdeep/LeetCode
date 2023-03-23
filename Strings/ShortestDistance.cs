// 243. Shortest Word Distance
// Easy
// 1.2K
// 103
// company
// LinkedIn
// company
// Amazon
// company
// Microsoft
// Given an array of strings wordsDict and two different strings that already exist in the array word1 and word2, return the shortest distance between these two words in the list.



// Example 1:

// Input: wordsDict = ["practice", "makes", "perfect", "coding", "makes"], word1 = "coding", word2 = "practice"
// Output: 3
// Example 2:

// Input: wordsDict = ["practice", "makes", "perfect", "coding", "makes"], word1 = "makes", word2 = "coding"
// Output: 1


// Constraints:

// 2 <= wordsDict.length <= 3 * 104
// 1 <= wordsDict[i].length <= 10
// wordsDict[i] consists of lowercase English letters.
// word1 and word2 are in wordsDict.
// word1 != word2
using System;

public class Solution
{
    public int ShortestDistance(string[] wordsDict, string word1, string word2)
    {
        int i1 = -1, i2 = -1;
        int minDistance = wordsDict.Length;

        for (int i = 0; i < wordsDict.Length; i++)
        {
            if (wordsDict[i].Equals(word1))
            {
                i1 = i;
            }
            else if (wordsDict[i].Equals(word2))
            {
                i2 = i;
            }

            if (i1 != -1 && i2 != -1)
            {
                minDistance = Math.Min(minDistance, Math.Abs(i1 - i2));
            }
        }
        return minDistance;

    }
}