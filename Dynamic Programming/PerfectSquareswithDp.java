//279. Perfect Squares My Submissions Question
//Total Accepted: 28716 Total Submissions: 90056 Difficulty: Medium
//Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
//
//For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.


  public class Solution {
        public int numSquares(int n) {
          
          int[] fewest = new int[n+1];
          
          fewest[0]=0;
          int min;
          
          
          for(int i=1;i<=n;i++)
          {
              min = i;
              
              for(int m=1;m*m<=i;m++)
              {
                  min=Math.min(min, 1 + fewest[i-m*m]);
                  
              }
              
              
              fewest[i]=min;
              
              
              
              
          }
          
          
          return fewest[n];
        }
    }