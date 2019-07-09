// 1089. Duplicate Zeros
// Easy

// 71

// 68

// Favorite

// Share
// Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

// Note that elements beyond the length of the original array are not written.

// Do the above modifications to the input array in place, do not return anything from your function.

 

// Example 1:

// Input: [1,0,2,3,0,4,5,0]
// Output: null
// Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
// Example 2:

// Input: [1,2,3]
// Output: null
// Explanation: After calling your function, the input array is modified to: [1,2,3]
 

// Note:

// 1 <= arr.length <= 10000
// 0 <= arr[i] <= 9


public class Solution {
    public void DuplicateZeros(int[] arr) {
        int length = arr.Length;
        int zeroCount = 0;

        for (int i = 0; i<length; i++)
        {
            if(arr[i] == 0)
                zeroCount++;
        }

        int len = length + zeroCount;
        for (int i = length-1, j= len - 1; i >= 0 && j>=0; i--, j--)
        {
            if(arr[i] != 0)
            {
                if(j < length)  arr[j] = arr[i];
            }
            else
            {
                if(j < length) arr[j] = arr[i];
                j--;
                if(j<length)    arr[j] = arr[i];
            }
        }
    }
}
