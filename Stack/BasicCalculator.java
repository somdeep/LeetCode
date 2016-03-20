//224. Basic Calculator My Submissions Question
//Total Accepted: 24957 Total Submissions: 115632 Difficulty: Medium
//Implement a basic calculator to evaluate a simple expression string.
//
//The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative integers and empty spaces .
//
//You may assume that the given expression is always valid.
//
//Some examples:
//"1 + 1" = 2
//" 2-1 + 2 " = 3
//"(1+(4+5+2)-3)+(6+8)" = 23
//Note: Do not use the eval built-in library function.

public class Solution {
    public int calculate(String s) {
        
        int len=s.length();
        int sign=1;
        int result=0;
        Stack<Integer> stack=new Stack<Integer>();
        int i,j;
        int val;
        int sum=0;
        char ch;
        
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                sum=ch-'0';
                while(i+1 < len && Character.isDigit(s.charAt(i+1)))
                {
                    sum=(sum*10) + s.charAt(i+1)-'0';
                    i++;
                }
                
                result+=sign * sum;
                
                
            }
            else if(ch=='+')
            {
                sign=1;
            }
            else if(ch=='-')
            {
                sign=-1;
            }
            
            else if(ch=='(')
            {
                stack.push(result);
                result=0;
                stack.push(sign);
                sign=1;
            }
            else if(ch==')')
            {
                result=result*stack.pop()+stack.pop();
            }
            
            
        }
        
        
        
        return result;
        
    }
}