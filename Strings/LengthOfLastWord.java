//58. Length of Last Word My Submissions Question
//Total Accepted: 82412 Total Submissions: 287624 Difficulty: Easy
//Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
//
//If the last word does not exist, return 0.
//
//Note: A word is defined as a character sequence consists of non-space characters only.
//
//For example, 
//Given s = "Hello World",
//return 5.


public class Solution {
    public int lengthOfLastWord(String s) {
        int i,len;
        len=s.length();
        if(len==0)
            return 0;
            int l=0;
        int flag=0;
        char ch;
        for(i=len-1;i>=0;i--)
        {
            ch=s.charAt(i);
            if(flag==0 && Character.isLetter(ch))
            {
                flag=1;
            }
            
            if(flag==1)
            {   
                if(ch==' ') 
                    break;
                l++;
            }
        }
        
        
        
        return l;   
    }
}