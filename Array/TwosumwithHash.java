import java.util.*;

public class Solution {
    public int[] twoSum(int[] nums, int target) {


        int len=nums.length;
        int[] result=new int[2];
        int val=0;
        int pos=0;
        int i;
        result[0]=0;
        result[1]=0;

        Hashtable<Integer,Integer> h= new Hashtable<Integer,Integer>(len);


         for(i=0;i<len;i++)
        {
            val=target-nums[i];
          if(h.containsKey(val))
          {
              pos=h.get(val);
              if(pos!=i)
              {
                  result[0]=pos+1;
                  result[1]=i+1;
                  return result;
              }

          }
            else
            h.put(nums[i],i);
        }








        return  result;

    }
}
