// 48. Rotate Image My Submissions Question
// Total Accepted: 60018 Total Submissions: 177240 Difficulty: Medium
// You are given an n x n 2D matrix representing an image.
//
// Rotate the image by 90 degrees (clockwise).
//
// Follow up:
// Could you do this in-place?

public class Solution {
    public void rotate(int[][] matrix) {
    int n = matrix.length;
    //int col=matrix[0].length;
    int[][] m= new int[n][n];

    // System.out.println(m.length);
    int ilimit = (n + 1) / 2;

    int jlimit = n / 2;
    // int ilimit = n;
    // int jlimit =n;

    for (int i = 0; i < ilimit; i++)
        for (int j = 0; j < jlimit;j++) {
            int tmp = matrix[i][j];
            // matrix[i][j] = matrix[n - j - 1][i];
            // matrix[n - j - 1][i] = matrix[n - 1 - i][n - 1 - j];
            // matrix[n - 1 - i][n - 1 - j] = matrix[j][n - i - 1];
            //  matrix[j][n - i - 1] = tmp;
            matrix[i][j]=matrix[n-j-1][i];
            matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
            matrix[n-i-1][n-j-1]=matrix[j][n-i-1];

            matrix[j][n-i-1]=tmp;
        }


        // for (int i = 0; i < n; i++)
        // for (int j = 0; j < n;j++) {
        // matrix[i][j]=m[i][j];

        // }
}
}
