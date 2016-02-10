// 3. Longest Substring Without Repeating Characters My Submissions Question
// Total Accepted: 125025 Total Submissions: 584067 Difficulty: Medium
// Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
//
// Subscribe to see which companies asked this question


import java.util.*;

public class Solution {
   public int lengthOfLongestSubstring(String s) {
    int start = 0;
    int end = 0;
    int head = 0;
    int len=s.length();
    Map<Character, Integer> metadataMap = new HashMap<>();

    for (int index = 0; index < len; index++) {
        char ch = s.charAt(index);

        Integer pos = metadataMap.put(ch, index);

        // pos < head : for the cases of previous substring's clutter
        if (pos == null || pos < head) {

                System.out.println(ch);

            if ((index + 1 - head) > (end - start)) {
                end = index + 1;
                start = head;
                //   if((end-start)==(len/2))
                // break;
            }
        } else {
            head = pos + 1;
        }
    }

    return end - start;
}
}
