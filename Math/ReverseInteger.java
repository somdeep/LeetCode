//7. Reverse Integer My Submissions Question
//Total Accepted: 116202 Total Submissions: 494425 Difficulty: Easy
//Reverse digits of an integer.
//
//Example1: x = 123, return 321
//Example2: x = -123, return -321
//


public class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        int i,j,len;
        len=s.length();
        String r="";
        int count=0;
        int down=0;
        
        if(s.charAt(0)=='-')
        {
            r+='-';
            down++;
        }
        
        for(i=len-1;i>=down;i--)
        {
            r+=(s.charAt(i));
        }
        //r+='\0';
        
      //  System.out.println(r);
        
        try
        {
        return Integer.parseInt(r);
        }
        
        catch(Exception e)
        {
            return 0;
        }
    }
}
