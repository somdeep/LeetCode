public class Solution {
    public boolean isHappy(int n) {

        int i,j;
        int num=n;
        int sum=0;
        int[] a= {0,1,4,9,16,25,36,49,64,81};

        String s;
        int len;
        i=0;
        char ch;
        while(true)
        {
            s=Integer.toString(n);
            len=(s.length()-1);

            while(len>=0)
            {//finds sum of squares for n

            ch=s.charAt(len);
            len--;
            //System.out.println(ch);
            sum= sum + a[ch-48];


            }


            if(sum<10)
            {
            if(sum==1||sum==7)
                return true;

            else if(sum<10)
                return false;
            }

            n=sum;
            sum=0;


        }



    }
}
