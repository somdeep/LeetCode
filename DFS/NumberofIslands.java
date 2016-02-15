// 200. Number of Islands My Submissions Question
// Total Accepted: 35541 Total Submissions: 133846 Difficulty: Medium
// Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

// Example 1:

// 11110
// 11010
// 11000
// 00000
// Answer: 1

// Example 2:

// 11000
// 11000
// 00100
// 00011
// Answer: 3

public class Solution {
	public static void dfs(char[][] grid, int i, int j) {
		if(i<0 ||i>=grid.length ||j<0 ||j>=grid[0].length)
			return;
		
		if(grid[i][j]=='1')
		{
			grid[i][j]='2';
			dfs(grid,i,j+1);
			dfs(grid,i,j-1);
			dfs(grid,i+1,j);
			dfs(grid,i-1,j);
			
		}
	}

	public static int numIslands(char[][] grid) {
		if(grid==null || grid.length==0)
			return 0;
		int row=grid.length;
		int col=grid[0].length;
		int count=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(grid[i][j]=='1')
				{
					count++;
					dfs(grid,i,j);
				}
			}
		}
		
		
		return count;
	}
}