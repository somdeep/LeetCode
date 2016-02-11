// 8. String to Integer (atoi) My Submissions Question
// Total Accepted: 86802 Total Submissions: 653523 Difficulty: Easy
// Implement atoi to convert a string to an integer.
//
// Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
//
// Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
//
// Update (2015-02-10):
// The signature of the C++ function had been updated. If you still see your function signature accepts a const char * argument, please click the reload button  to reset your code definition.
//
// spoilers alert... click to show requirements for atoi.
//
// Requirements for atoi:
// The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
//
// The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
//
// If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
//
// If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
//

public class Solution {
    public int myAtoi(String str) {
        int len=str.length();
        if(len==0)
        return 0;
        double result=0;
        int neg=0;
        char ch;
        int i=0;
        int j;
        int val=0;
        String st;
         String s = str.trim();
        len=s.length();

        if(s.charAt(0)=='-')
        {neg=1;i++;}

        if(s.charAt(0)=='+')
        i++;

        st=s.substring(i,len);
         len=st.length();
         if(len==0)
         return 0;
        if(!Character.isDigit(st.charAt(0)))
            return 0;
       // System.out.println(st.charAt(0));
        //String st = s.trim();



       // System.out.println(st);
        j=1;
        for(i=0;i<len;i++)
        {
            ch=st.charAt(i);

            if(!Character.isDigit(ch))
                break;

            val=(int)ch;

            val-=48;
           // System.out.println(val);
           result=result*10 + val;

           j*=10;

        }

        //  System.out.println(neg);
        // System.out.println(result);
        if(neg==1)
            result=-result;

        if(result<-2147483648 && neg==0)
            return 2147483647;
        if(result<-2147483648)
            return -2147483648;

        if(result>2147483647)
            return 2147483647;


        return (int)result;
    }
}
