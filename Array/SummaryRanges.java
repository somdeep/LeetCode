//228. Summary Ranges My Submissions Question
//Total Accepted: 38835 Total Submissions: 166807 Difficulty: Easy
//Given a sorted integer array without duplicates, return the summary of its ranges.
//
//For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].



public class Solution {
    public List<String> summaryRanges(int[] nums) {
    int len=nums.length;
    List<String> stl=new ArrayList<String>();
    if(len==0)
        return stl;
    
    String s="";
    char ch;
    int prev=-1;
    int cur=-1;
    int i;
    int count=0;
    for(i=0;i<len;i++)
    {
        cur=nums[i];
        if(s.equals(""))
        {
           // System.out.println(cur);
            s=s.concat(Integer.toString(cur));
            
            //s.concat("\0");
            //System.out.println(s);
            prev=cur;
            count++;
        }
        
        else if(prev==cur-1)
        {
            prev=cur;
            count++;
            continue;
        }
        else
        {
            if(count>1)
            {
                //System.out.println(prev+" "+s.charAt(0));
                s=s.concat("->");
                s=s.concat(Integer.toString(prev));
            }
            stl.add(s);
            s="";
            count=0;
            i--;
        }
        
        
        
    
        
    }
        if(count>1)
            {
                //System.out.println(prev+" "+s.charAt(0));
                s=s.concat("->");
                s=s.concat(Integer.toString(prev));
            }
            stl.add(s);
    
        return stl;
    }
}