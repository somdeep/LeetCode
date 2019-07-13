// 557. Reverse Words in a String III
// Easy

// 645

// 67

// Favorite

// Share
// Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

// Example 1:
// Input: "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"
// Note: In the string, each word is separated by single space and there will not be any extra space in the string.

public class Solution {
    public string ReverseWords(string s) {
        int i = 0;
        Stack<char> st = new Stack<char>();
        char[] result = new char[s.Length];
            
        foreach (char ch in s)
        {
            if(ch!=' ')
            {
                st.Push(ch);
            }
            else
            {
                while(st.Count > 0)
                {
                    result[i++]= st.Pop();
                }

                result[i++]=' ';
            }
        }    

        while(st.Count > 0)
        {
            result[i++]= st.Pop();
        }

        return new String(result);
    }
}