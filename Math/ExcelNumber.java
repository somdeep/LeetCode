//171. Excel Sheet Column Number My Submissions Question
//Total Accepted: 62037 Total Submissions: 155228 Difficulty: Easy
//Related to question Excel Sheet Column Title
//
//Given a column title as appear in an Excel sheet, return its corresponding column number.
//
//For example:
//
//    A -> 1
//    B -> 2
//    C -> 3
//    ...
//    Z -> 26
//    AA -> 27
//    AB -> 28 



public class Solution {
    public int titleToNumber(String s) {
        int len=s.length();
        int res=0;
        String str=s;
        int i;
        int j=len-1;
       
        int val=0;
        int power;
        len--;
        for(i=0;i<=len;i++)
        {
            val=(int)str.charAt(j);
            val=val-64;
           power=(int)Math.pow(26,len-j);
            val=val*power;
            res=res+val;
            j--;
            
                
            
        }
        
        return res;
    }
}