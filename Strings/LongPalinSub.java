// 5. Longest Palindromic Substring My Submissions Question
// Total Accepted: 92406 Total Submissions: 414204 Difficulty: Medium
// Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.

public class Solution {
  public String longestPalindrome(String s) {
    char[] ca = s.toCharArray();
    int rs = 0, re = 0;
    int max = 0;
    for(int i = 0; i < ca.length; i++) {
        if(isPalindrome(ca, i - max - 1, i)) {
            rs = i - max - 1; re = i;
            max += 2;
        } else if(isPalindrome(ca, i - max, i)) {
            rs = i - max; re = i;
            max += 1;
        }
    }
    return s.substring(rs, re + 1);
}

private boolean isPalindrome(char[] ca, int s, int e) {
    if(s < 0) return false;

    while(s < e) {
        if(ca[s++] != ca[e--]) return false;
    }
    return true;
}

public class Solution {
  public String longestPalindrome(String s) {
    char[] ca = s.toCharArray();
    int rs = 0, re = 0;
    int max = 0;

    for(int i=0;i<ca.length;i++)
    {
        if(isPalindrome(ca,i-max-1,i))
        {
            rs=i-max-1;re=i;
            max+=2;
        }
        else if(isPalindrome(ca,i-max,i))
        {
            rs=i-max;re=i;
            max+=1;
        }
    }

   return s.substring(rs,re+1);
}

private boolean isPalindrome(char[] ca, int s, int e) {
   if(s<0)
    return false;

    while(s<e)
    {
        if(ca[s++]!=ca[e--])
            return false;
    }

    return true;
}

}}
