//Longest common prefix for array of strings

import java.io.*;

public class Solution {
    public String longestCommonPrefix(String[] str) {
     int i,j;
     int len;
      if(str.length<1)
     return "";
     int min = shortest(str);
     char ch;
     int flag=0;

     j=0;



      for(j=0;j<min;j++)
      {
          if(flag==1)
          break;


         ch= str[0].charAt(j);
         for(i=0;i<str.length;i++)
         {
            if (str[i].charAt(j) != ch )
            {
                flag=1;
                break;
            }
         }

     }
     if(flag==1)
     {
         j--;
     }
     System.out.println(j);

     return str[0].substring(0,j);




    }

    public int shortest(String[] str)
    {
        int i,j,len;
        int min=0;
        len=str.length;

        for(i=0;i<len;i++)
        {
            j=str[i].length();

            if(j<str[min].length())
                min=i;
        }

        System.out.println("in shortest : length : " + str[min].length());

        return str[min].length();
    }
}
