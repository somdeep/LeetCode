import java.lang.*;


public class Solution {
    public String addBinary(String a, String b) {
        int alen=a.length();
        int blen=b.length();
        Long sum;
        if ((a.equals("") && (b.equals(""))))
        {
            return "0";
        }

        else if(b.equals(""))
        return a;

        else if(a.equals(""))
        return b;


        long i,j,l;
        int carry;


        i=j=0;

        try
        {
        i=Long.parseLong(a,2);
        }
        catch(NumberFormatException e)
        {
            e.printStackTrace();
            System.out.println(e);

        }

        try
        {
        j=Long.parseLong(b,2);
        }
        catch(NumberFormatException e)
        {
            e.printStackTrace();
        }

        sum=i+j;

        return(Long.toBinaryString(sum));


    }
}
