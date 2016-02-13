// 49. Group Anagrams My Submissions Question
// Total Accepted: 65081 Total Submissions: 246321 Difficulty: Medium
// Given an array of strings, group anagrams together.
//
// For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
// Return:
//
// [
//   ["ate", "eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]
//
// Note:
// For the return value, each inner list's elements must follow the lexicographic order.
// All inputs will be in lower-case.
import java.util.*;


    public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        if (strs==null || strs.length==0) { return ans; }
        Arrays.sort(strs);
        Map<String, List<String>> map = new HashMap<>();

        for(String s:strs)
        {
            char[] sc=s.toCharArray();
            Arrays.sort(sc);
            String key=new String(sc);
            List<String> val=map.get(key);
            if(val==null)
            {
                List<String> a=new ArrayList<>();
                a.add(s);
                map.put(key,a);
            }
            else
                val.add(s);



        }

            ans.addAll(map.values());



            return ans;
    }
}
