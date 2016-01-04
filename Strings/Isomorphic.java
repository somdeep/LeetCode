//205. Isomorphic Strings My Submissions Question
//Total Accepted: 40761 Total Submissions: 147227 Difficulty: Easy
//Given two strings s and t, determine if they are isomorphic.
//
//Two strings are isomorphic if the characters in s can be replaced to get t.
//
//All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
//
//For example,
//Given "egg", "add", return true.
//
//Given "foo", "bar", return false.
//
//Given "paper", "title", return true.



import java.util.*;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        
            
            int slen,tlen;
            slen=s.length();
            tlen=t.length();
            int i,j;
            char val,pos,other;
            if(slen==0 && tlen == 0)
            return true;
            else if(slen==0 || tlen ==0)
            return false;
            
            HashMap h = new HashMap();
            
            for(i=0;i<slen;i++)
            {
                    val=s.charAt(i);
                    other=t.charAt(i);
                    
                    
                 if(h.containsKey(val))
                {
                  pos=(char)h.get(val);
                  if(pos!=other)
                  {
                     return false;
                  }

                }
                else
                {
                    if(h.containsValue(other))
                    return false;
                    else
                    h.put(val,other);
                }
            }
            
            
            return true;
            

    }
}