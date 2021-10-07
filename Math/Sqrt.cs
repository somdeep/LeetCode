// 69. Sqrt(x)
// Easy

// 2628

// 2678

// Add to List

// Share
// Given a non-negative integer x, compute and return the square root of x.

// Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

// Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.



// Example 1:

// Input: x = 4
// Output: 2
// Example 2:

// Input: x = 8
// Output: 28
// Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.


// Constraints:

// 0 <= x <= 231 - 1

public class Solution
{
    public int MySqrt(int x)
    {
        int sqrt = 0;
        int factor = 1;

        while (x > 0 && factor <= x)
        {
            x = x - factor;
            factor += 2;
            sqrt++;
        }

        return sqrt;

    }
}