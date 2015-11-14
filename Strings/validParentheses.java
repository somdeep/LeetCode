//Valid Parenthesization
// Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
// The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

import java.util.*;

public class Solution {
    public boolean isValid(String s) {

        Stack<Character> st=new Stack<Character>();
        int len = s.length();
        int i,j;
        int flag=0;


        if (len==0)
        return true;

        for(i=0;i<len;i++)
        {

            if(s.charAt(i) != '(' && s.charAt(i) != ')' &&s.charAt(i) != '{' &&s.charAt(i) != '}' &&s.charAt(i) != '[' && s.charAt(i) != ']')
            {
            flag=1;
            return false;
            }


            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
             st.push(s.charAt(i));

            else
            {
                if(st.size()==0)
                return false;

                if(s.charAt(i)== ')')
                {
                    if(st.pop()!='(')
                    return false;
                }
                if(s.charAt(i)== '}')
                {
                    if(st.pop()!='{')
                    return false;
                }
                if(s.charAt(i)== ']')
                {
                    if(st.pop()!='[')
                    return false;
                }
            }



        }

        if(st.size()==0)
        return true;

        else
        return false;









    }
}
