//290. Word Pattern My Submissions Question
//Total Accepted: 23929 Total Submissions: 86070 Difficulty: Easy
//Given a pattern and a string str, find if str follows the same pattern.
//
//Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
//
//Examples:
//pattern = "abba", str = "dog cat cat dog" should return true.
//pattern = "abba", str = "dog cat cat fish" should return false.
//pattern = "aaaa", str = "dog cat cat dog" should return false.
//pattern = "abba", str = "dog dog dog dog" should return false.
//Notes:
//You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.




import java.util.*;


public class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap hm =new HashMap();
        int i,j;
        j=0;
        String s,u,v;
        int len=str.length();
       // hm.put("somdeep",1);
        String parts[]=str.split(" ");
       // System.out.println(hm.get("somdeep"));
        len=parts.length;
        int l=pattern.length();
        char p;
        if(l!=len)
        return false;
        char t;
        while(j<len)
        {
            p=pattern.charAt(j);
            if(hm.containsKey(parts[j]))
            {
                t=(char)hm.get(parts[j]);
                if(!(t==p))
                {
                    return false;
                }
                
                j++;
            }
            
            else
            {
                
                if(hm.containsValue(p))
                return false;
                
                
                hm.put(parts[j],p);
                j++;
            }
        }
        
        
        
        
        
        
        
        
        return true;
    }
}