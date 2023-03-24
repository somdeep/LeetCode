// 7. Reverse Integer
// Medium
// 10.1K
// 11.8K
// company
// Amazon
// company
// Bloomberg
// company
// Apple
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21


// Constraints:

// -231 <= x <= 231 - 1
// Accepted
// 2.5M
// Submissions
// 9.2M
// Acceptance Rate
// 27.4%
using System;

public class Solution
{
    public int Reverse(int x)
    {
        int result = 0;

        while (x != 0)
        {
            int digit = x % 10;
            x = x / 10;

            if (result > Int32.MaxValue / 10) return 0;
            if (result < Int32.MinValue / 10) return 0;

            result = result * 10 + digit;
        }

        return result;
    }
}