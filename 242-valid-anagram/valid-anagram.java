class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null|| t==null)
        return false;
        s=s.replaceAll("\\s+","").toLowerCase();
          t=t.replaceAll("\\s+","").toLowerCase();
        if(s.length()!=t.length())
         return false;
         //for lower case 
         int [] freq=new int[26];
         // count freq of each char at s
         for(int i=0;i<s.length();i++)
         {
            freq[s.charAt(i)-'a']++;
         } 

          // count freq of each char at t
         for(int i=0;i<t.length();i++)
         {
            freq[t.charAt(i)-'a']--;
         }
         for(int count=0;count<freq.length;count++)
         {
            if(freq[count]!=0)
            {
                return false;
            }
         } 
         return  true;
    }
}