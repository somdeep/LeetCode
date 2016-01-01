

public class Insertion
{
    
    
    public static void main(String args[])
    {
        System.out.println("Hello World");
        int nums[]={7,6,5,4,3,2,1};
        //System.out.println(nums[0]);
        int i,j;
        int pos;
        int min;
        int len = nums.length;
        int temp;
        int pass=0;
        
        
        for(i=0;i<len-1;i++)
        {
            //current=nums[i+1];
            //pos=i+1;
            for(j=i;j>=0;j--)
            {
                System.out.println("Pass " + (pass++));
                if(nums[j+1]<nums[j])
                {
                    temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    
                }
                else
                    break;
                
            }
        }
        
        
        for(i=0;i<len;i++)
        {
            System.out.println(nums[i]);
            
        }
        
        
    }
    
    
}