//279. Perfect Squares My Submissions Question
//Total Accepted: 28725 Total Submissions: 90077 Difficulty: Medium
//Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
//
//For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.


public class Solution {
    public int numSquares(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        int state[] = new int [n+1];
		int i,j;
		int maxroot = (int)Math.sqrt(n);
		int min;
		int positive;
		//System.out.println(maxroot);
		int val;
		for(i=1;i<=n;i++)
		{
		    state[i] = Integer.MAX_VALUE;
		}
		for(i=1;i<=maxroot;i++)
		{
		    state[i*i] = 1;
		}
		
// 		for(i=1;i<=n;i++)
// 		{
// 		    min = state[i];
// 		    for(j=1;j<i;j++)
// 		    {
// 		        val = state[j] + state[i-j];
// 		        if(val<min)
// 		            min=val;
// 		    }
// 		    state[i]=min;
// 		}
		
		for( i=1;i<=maxroot;i++){
			positive = i*i;
			for(j=positive;j<=n-positive;j++){
				if (state[j]+state[positive]
                                                  <state[j+positive]) {
					state[j+positive] 
                                                    = state[j]+state[positive];     
				}
			}
		}
		
		
		
		return state[n];
    }
}