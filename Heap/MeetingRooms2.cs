// 253.Meeting Rooms II
// Medium
// 6.4K
// 136
// company
// Bloomberg
// company
// Amazon
// company
// Apple
// Given an array of meeting time intervals intervals where intervals[i] = [starti, endi], return the minimum number of conference rooms required.



// Example 1:

// Input: intervals = [[0, 30],[5,10],[15,20]]
// Output: 2
// Example 2:

// Input: intervals = [[7, 10],[2,4]]
// Output: 1



// Constraints:

// 1 <= intervals.length <= 104
// 0 <= starti < endi <= 106
// Accepted
// 771.6K
// Submissions
// 1.5M
// Acceptance Rate
// 50.6%

public class Solution
{
    public int MinMeetingRooms(int[][] intervals)
    {

        if (intervals.Length == 0) return 0;
        if (intervals.Length == 1) return 1;

        Array.Sort(intervals, (x, y) => x[0].CompareTo(y[0]));

        PriorityQueue<int, int> pq = new PriorityQueue<int, int>();
        pq.Enqueue(intervals[0][1], intervals[0][1]);

        for (int i = 1; i < intervals.Length; i++)
        {
            if (intervals[i][0] >= pq.Peek()) pq.Dequeue();

            pq.Enqueue(intervals[i][1], intervals[i][1]);
        }

        return pq.Count;
    }
}