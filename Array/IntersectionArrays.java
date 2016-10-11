// 350. Intersection of Two Arrays II  QuestionEditorial Solution  My Submissions
// Total Accepted: 36816
// Total Submissions: 86336
// Difficulty: Easy
// Given two arrays, write a function to compute their intersection.

// Example:
// Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

// Note:
// Each element in the result should appear as many times as it shows in both arrays.
// The result can be in any order.
// Follow up:
// What if the given array is already sorted? How would you optimize your algorithm?
// What if nums1's size is small compared to nums2's size? Which algorithm is better?
// What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?



import java.util.*;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     int l1,l2;
     l1=nums1.length;
     l2=nums2.length;
     int i,j;
     HashMap hm = new HashMap();
     ArrayList<Integer> al = new ArrayList<Integer>();
     
    //  if(l1 == 0 || l2 == 0)
    //     return null;
     int len = (l1<l2)?l1:l2;
     int[] res = new int[len];
     int count = 0;
     if(len == 0)
        return res;
            
    //  System.out.println(len);
     
     if(l1> l2)
     {
         for(i=0;i<l1;i++)
         {
             if(hm.containsKey(nums1[i]))
                hm.put(nums1[i],(int)(hm.get(nums1[i])) + 1);
             else
                hm.put(nums1[i],1);
            
         }
         
         for(i=0;i<l2;i++)
         {
             if(hm.containsKey(nums2[i]))
             {
                 if((int)(hm.get(nums2[i]))>0)
                 {
                hm.put(nums2[i],(int)(hm.get(nums2[i])) - 1);
                al.add(nums2[i]);
                //result[count++] = nums2[i];
                count++;
                 }
             }  
            
            
         }
     }
     
     else
     {
         for(i=0;i<l2;i++)
         {
             if(hm.containsKey(nums2[i]))
                hm.put(nums2[i],(int)(hm.get(nums2[i])) + 1);
             else
                hm.put(nums2[i],1);
            
         }
         
         for(i=0;i<l1;i++)
         {
             if(hm.containsKey(nums1[i]))
             {
                 if((int)(hm.get(nums1[i]))>0)
                 {
                    hm.put(nums1[i],(int)(hm.get(nums1[i])) - 1);
                    al.add(nums1[i]);
                    count++;
                   //result[count++] = nums1[i];
                 }
                 
             }  
            
            
         }
     }
     
     
     
    //  int[] res = new int[count-1];
    //  for(i=0;i<count-1;i++)
    //  {  
    //     res[i] = result[i]; 
    //  }
    //  System.out.println("al  -   " + al);
    //  System.out.println("count : " + count);
     Integer[] result = new Integer[count];
     result=al.toArray(result);
     j=0;
     int[] r = new int[count];
     for(j=0;j<count;j++)
     {
         r[j] = al.get(j);
     }
     return r;
    }
}