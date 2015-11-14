import java.util.*;

public class Solution {
    public boolean isAnagram(String s, String t) {


        int slen,tlen;
        slen=s.length();
        tlen=t.length();


        if(slen ==0 && tlen ==0)
        return true;

        else if(slen == 0 || tlen ==0)
        return false;

        else if(slen != tlen)
        return false;


        Hashtable<Character,Integer> h= new Hashtable<Character,Integer>(26);
        int i,j,c;


        for(i=0;i<slen;i++)
        {
          if(h.containsKey(s.charAt(i)))
          {
            c=h.get(s.charAt(i));
            h.put(s.charAt(i),c + 1);
          }
            else
            h.put(s.charAt(i),1);
        }


        for(i=0;i<tlen;i++)
        {
            if(h.containsKey(t.charAt(i)))
            {
                j=h.get(t.charAt(i));

                if(j>0)
                {
                j--;
                h.put(t.charAt(i),j);
                }
                else
                return false;
            }
            else
            return false;
        }








        return true;

    }
}
