// 709. To Lower Case
// Easy

// 286

// 989

// Favorite

// Share
// Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

 

// Example 1:

// Input: "Hello"
// Output: "hello"
// Example 2:

// Input: "here"
// Output: "here"
// Example 3:

// Input: "LOVELY"
// Output: "lovely"


public class Solution {
    public string ToLowerCase(string str) {
        string result = string.Empty;
        foreach (char res in str)
        {
            char ch = res;
            if(ch >= 'A' && ch <= 'Z')
                ch = (char)(ch + 'a' - 'A');

            result += ch;
        }

        return result;   
    }
}