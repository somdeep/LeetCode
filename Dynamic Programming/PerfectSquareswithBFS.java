//279. Perfect Squares My Submissions Question
//Total Accepted: 28725 Total Submissions: 90077 Difficulty: Medium
//Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
//
//For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.

public class Solution {
    public int numSquares(int n) {
        if(n<=0)
            return 0;
        
        int[] dp= new int[n+1];
        Queue<Integer> q = new LinkedList<Integer>();
        
        for(int i=1;i*i<=n;i++)
        {
            if(i*i == n)
            {
                return 1;
            }
            dp[i*i]=1;
            q.add(i*i);
        }
        
        
        
        while(!q.isEmpty())
        {
            int cur=q.peek();
            
            for(int i=1;i*i<=n-cur;i++)
            {
                
                if(cur + i*i == n)
                    return dp[cur] + 1;
                
                else if(cur+i*i < n && dp[cur+i*i]==0)
                {
                    dp[cur + i*i] = dp[cur] + 1;
                    q.add(cur + i*i);
                    
                }
                
                
                else if(cur + i*i > n)
                    break;
                
                
                
            }
            
            q.poll();
        }
        
        
        return 0;
    }
}