
bool isHappy(int n) {

        int i,j;
        int num=n;
        int sum=0;

        while(1)
        {
            while(n>0)
            {//finds sum of squares for n
            num=n%10;
            sum= sum + (num)*(num);
            n=n/10;
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
