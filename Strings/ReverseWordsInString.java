//151. Reverse Words in a String My Submissions Question
//Total Accepted: 94941 Total Submissions: 607363 Difficulty: Medium
//Given an input string, reverse the string word by word.
//
//For example,
//Given s = "the sky is blue",
//return "blue is sky the".
//
//Update (2015-02-12):
//For C programmers: Try to solve it in-place in O(1) space.
//
//click to show clarification.
//
//Clarification:
//What constitutes a word?
//A sequence of non-space characters constitutes a word.
//Could the input string contain leading or trailing spaces?
//Yes. However, your reversed string should not contain leading or trailing spaces.
//How about multiple spaces between two words?
//Reduce them to a single space in the reversed string.

public class Solution {
    public String reverseWords(String s) {
       String res="";
    String afterTrim= s.trim();
    String[] split=afterTrim.split(" +");
    StringBuilder sb= new StringBuilder();
    for(int i=split.length-1;i>=0;i--){
         sb.append(split[i]+" ");
    }
    return sb.toString().trim();

    }
}