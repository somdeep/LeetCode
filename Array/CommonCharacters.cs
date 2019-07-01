// 1002. Find Common Characters
// Easy

// 278

// 42

// Favorite

// Share
// Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.

// You may return the answer in any order.

 

// Example 1:

// Input: ["bella","label","roller"]
// Output: ["e","l","l"]
// Example 2:

// Input: ["cool","lock","cook"]
// Output: ["c","o"]
 

// Note:

// 1 <= A.length <= 100
// 1 <= A[i].length <= 100
// A[i][j] is a lowercase letter

public class Solution {
    public IList<string> CommonChars(string[] A) {

        Dictionary<char, int> map = new Dictionary<char,int>();
        List<string> result = new List<string>();
        string first = A.First();        

        foreach(char c in first)
        {
                if(map.ContainsKey(c))
                {
                    map[c] = map[c] + 1;
                }
                else
                {
                    map.Add(c, 1);
                }
        }

        List<char> keys = new List<char>(map.Keys);
        for (int i = 1; i < A.Length; i++)
        {
            Dictionary<char, int> innerMap = new Dictionary<char, int>();
            string str = A[i];
            foreach(char c in str)
            {
                if(innerMap.ContainsKey(c))
                {
                    innerMap[c] = innerMap[c] + 1;
                }
                else if(keys.Contains(c))
                {
                    innerMap.Add(c,1);
                }
            }

            foreach(var key in keys)
            {
                int value = 0;
                innerMap.TryGetValue(key, out value);
                map[key] = Math.Min(map[key], value);
            }
        }

        foreach(var entry in map)
        {
            
                for(int i = 0; i<entry.Value ; i++)
                    result.Add(entry.Key.ToString());
            
        }

        return result;
    }
}