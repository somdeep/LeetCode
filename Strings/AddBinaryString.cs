// 67. Add Binary
// Solved
// Easy
// Topics
// Companies
// Given two binary strings a and b, return their sum as a binary string.



// Example 1:

// Input: a = "11", b = "1"
// Output: "100"
// Example 2:

// Input: a = "1010", b = "1011"
// Output: "10101"


// Constraints:

// 1 <= a.length, b.length <= 104
// a and b consist only of '0' or '1' characters.
// Each string does not contain leading zeros except for the zero itself.

public class Solution
{
    public string AddBinary(string a, string b)
    {
        int alen = a.Length - 1;
        int blen = b.Length - 1;
        int carry = 0;
        int sum = 0;
        StringBuilder result = new StringBuilder("");

        while (carry > 0 || (alen >= 0) || blen >= 0)
        {
            int aval = alen >= 0 ? a[alen] - '0' : 0;
            int bval = blen >= 0 ? b[blen] - '0' : 0;

            sum = (carry + aval + bval) % 2;
            carry = (carry + aval + bval) / 2;

            Console.WriteLine(sum);

            result.Insert(0, sum);

            alen--;
            blen--;
        }

        return result.ToString();

    }
}