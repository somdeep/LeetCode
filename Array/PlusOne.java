//66. Plus One My Submissions Question
//Total Accepted: 84050 Total Submissions: 259014 Difficulty: Easy
//Given a non-negative number represented as an array of digits, plus one to the number.
//
//The digits are stored such that the most significant digit is at the head of the list.



public class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] < 9){
            digits[digits.length - 1]++;
        }
        else{
            int i = digits.length - 1;
            while(digits[i] == 9){
                digits[i] = 0;
                i--;
                if(i<0) break;
            }
            if(digits[0] == 0){
                digits = Arrays.copyOf(digits, digits.length+1);
                digits[0] = 1;
            }
            else{
                digits[i]++;
            }
        }
        return digits;
    }
}