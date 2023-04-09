// 36. Valid Sudoku
// Medium
// 8.3K
// 893
// company
// Amazon
// company
// Apple
// company
// Karat
// Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

// Each row must contain the digits 1-9 without repetition.
// Each column must contain the digits 1-9 without repetition.
// Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
// Note:

// A Sudoku board (partially filled) could be valid but is not necessarily solvable.
// Only the filled cells need to be validated according to the mentioned rules.


// Example 1:


// Input: board = 
// [["5","3",".",".","7",".",".",".","."]
// ,["6",".",".","1","9","5",".",".","."]
// ,[".","9","8",".",".",".",".","6","."]
// ,["8",".",".",".","6",".",".",".","3"]
// ,["4",".",".","8",".","3",".",".","1"]
// ,["7",".",".",".","2",".",".",".","6"]
// ,[".","6",".",".",".",".","2","8","."]
// ,[".",".",".","4","1","9",".",".","5"]
// ,[".",".",".",".","8",".",".","7","9"]]
// Output: true
// Example 2:

// Input: board = 
// [["8","3",".",".","7",".",".",".","."]
// ,["6",".",".","1","9","5",".",".","."]
// ,[".","9","8",".",".",".",".","6","."]
// ,["8",".",".",".","6",".",".",".","3"]
// ,["4",".",".","8",".","3",".",".","1"]
// ,["7",".",".",".","2",".",".",".","6"]
// ,[".","6",".",".",".",".","2","8","."]
// ,[".",".",".","4","1","9",".",".","5"]
// ,[".",".",".",".","8",".",".","7","9"]]
// Output: false
// Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.


// Constraints:

// board.length == 9
// board[i].length == 9
// board[i][j] is a digit 1-9 or '.'.
// Accepted
// 1.1M
// Submissions
// 1.8M
// Acceptance Rate
// 58.1%

using System.Collections.Generic;
public class Solution
{
    public bool IsValidSudoku(char[][] board)
    {
        int n = 9;

        HashSet<char>[] rows = new HashSet<char>[n];
        HashSet<char>[] cols = new HashSet<char>[n];
        HashSet<char>[] boxes = new HashSet<char>[n];

        for (int i = 0; i < n; i++)
        {
            rows[i] = new HashSet<char>();
            cols[i] = new HashSet<char>();
            boxes[i] = new HashSet<char>();
        }

        for (int r = 0; r < n; r++)
        {
            for (int c = 0; c < n; c++)
            {
                char val = board[r][c];

                if (val == '.') continue;

                if (rows[r].Contains(val)) return false;
                rows[r].Add(val);

                if (cols[c].Contains(val)) return false;
                cols[c].Add(val);

                int box = (r / 3) * 3 + (c / 3);
                if (boxes[box].Contains(val)) return false;
                boxes[box].Add(val);
            }
        }

        return true;
    }
}