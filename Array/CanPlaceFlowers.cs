// 605. Can Place Flowers
// Solved
// Easy
// Topics
// Companies
// You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.



// Example 1:

// Input: flowerbed = [1,0,0,0,1], n = 1
// Output: true
// Example 2:

// Input: flowerbed = [1,0,0,0,1], n = 2
// Output: false


// Constraints:

// 1 <= flowerbed.length <= 2 * 104
// flowerbed[i] is 0 or 1.
// There are no two adjacent flowers in flowerbed.
// 0 <= n <= flowerbed.length
// Seen this question in a real interview before?
// 1/4
// Yes
// No
// Accepted
// 663.2K
// Submissions
// 2.2M
// Acceptance Rate
// 29.6%

public class Solution
{
    public bool CanPlaceFlowers(int[] flowerbed, int n)
    {
        if (n == 0) return true;

        int left = -1;
        int right = -1;
        int count = 0;
        int leftval = 0;
        int rightval = 0;
        bool canPlant = false;

        for (int i = 0; i < flowerbed.Length;)
        {
            left = i - 1;
            right = i + 1;
            canPlant = false;

            leftval = left < 0 ? 0 : flowerbed[left];
            rightval = right >= flowerbed.Length ? 0 : flowerbed[right];

            if (leftval == 0 && rightval == 0 && flowerbed[i] != 1)
            {
                count++;
                if (count == n) return true;
                flowerbed[i] = 1;
                i += 2;
                continue;
            }

            i++;

        }

        if (count >= n) return true;

        return false;
    }
}