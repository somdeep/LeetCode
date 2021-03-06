// Given two strings s and t which consist of only lowercase letters.

// String t is generated by random shuffling string s and then add one more letter at a random position.

// Find the letter that was added in t.

// Example:

// Input:
// s = "abcd"
// t = "abcde"

// Output:
// e

// Explanation:
// 'e' is the letter that was added.

public class Solution {
    public char findTheDifference(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        int i,j;
        char ch;        
        int val;
        char result=' ';
        int ssum,tsum;
        ssum=tsum=0;
        if(tlen>0)
        tsum = t.charAt(0);
        
        for(i=0;i<slen;i++)
        {
            ch = s.charAt(i);
            ssum += ch;
            ch = t.charAt(i+1);
            tsum += ch;
        }
        
        return (char)(tsum-ssum);
    }
}