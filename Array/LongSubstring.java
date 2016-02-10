// 3. Longest Substring Without Repeating Characters My Submissions Question
// Total Accepted: 125025 Total Submissions: 584067 Difficulty: Medium
// Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
//
// Subscribe to see which companies asked this question

import java.util.*;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        if(len==0 || len ==1)
        return len;
        //System.out.println("Crossed");
        //HashMap hm = new HashMap();
        int i,j;
        int pos;
        int result=0;
        char cur,prev;
        String sub="";
        int max=1;
        int discard=0;

        for(i=0;i<len;i++)
        {
            cur=s.charAt(i);
            pos=sub.indexOf(cur);
            if((pos)== -1)
            {
                sub+=cur;
               // System.out.println(sub);
                result+=1;
                if(result>max)
                    max=result;
            }
            else
            {
                i=s.indexOf(cur,i-result);
                sub="";
                if(result>max)
                    max=result;
                result=0;
                discard=s.indexOf(s.charAt(pos));
            }


        }

        return max;


    }
}
