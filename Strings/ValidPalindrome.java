// 125. Valid Palindrome   QuestionEditorial Solution  My Submissions
// Total Accepted: 126061
// Total Submissions: 505693
// Difficulty: Easy
// Contributors: Admin
// Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

// For example,
// "A man, a plan, a canal: Panama" is a palindrome.
// "race a car" is not a palindrome.

// Note:
// Have you consider that the string might be empty? This is a good question to ask during an interview.

// For the purpose of this problem, we define empty string as valid palindrome.

// Subscribe to see which companies asked this question

// Hide Tags Two Pointers String
// Show Similar Problems

public class Solution {
   public boolean isPalindrome(String s) {
    int len = s.length();
    if(len == 0)
        return true;
    int i,j;
    i=0;
    j=len-1;
    
    while(i<j)
    {
      
      
      if(!Character.isLetterOrDigit(s.charAt(i)))
      {
        i++;
        continue;
      }
         
      if(!Character.isLetterOrDigit(s.charAt(j)))
      {
        j--;
        continue;
      }
      
            
            
      if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j)))
      {
        
        i++;
        j--;
      }
      else
        return false;
      
    }
    
    
    
    return true;
      
    
          
  }
}