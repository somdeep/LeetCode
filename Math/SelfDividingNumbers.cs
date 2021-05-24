// 728. Self Dividing Numbers
// Easy

// 890

// 321

// Add to List

// Share
// A self-dividing number is a number that is divisible by every digit it contains.

// For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

// Also, a self-dividing number is not allowed to contain the digit zero.

// Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

// Example 1:
// Input: 
// left = 1, right = 22
// Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
// Note:

// The boundaries of each input argument are 1 <= left <= right <= 10000.
using System.Collections.Generic;

public class Solution
{
    public IList<int> SelfDividingNumbers(int left, int right)
    {
        List<int> result = new List<int>();
        for (int i = left; i <= right; i++)
        {
            int num = i;
            bool isSelfDividing = true;

            while (num > 0)
            {
                int digit = num % 10;
                if (digit == 0 || i % digit != 0)
                {
                    isSelfDividing = false;
                    break;
                }

                num = num / 10;
            }

            if (isSelfDividing)
            {
                result.Add(i);
            }

        }

        return result;
    }
}