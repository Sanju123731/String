class Solution {
    public boolean checkInclusion(String s1, String s2) {
       
         if(s2.length()<s1.length())
        return false;
        int pCount[]=new int[26];
        int sCount[]=new int[26];
        for(char c:s1.toCharArray())
        {
            pCount[c-'a']++;
        }
        int window=s1.length();
        for(int i=0;i<window;i++)
        {
            sCount[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(pCount,sCount))
        {
            return true;
        }
        for(int i=window;i<s2.length();i++)
        {
            char newChar=s2.charAt(i);
             char oldChar=s2.charAt(i-window);
             sCount[newChar-'a']++;
             sCount[oldChar-'a']--;
               if(Arrays.equals(pCount,sCount))
               {
                  return true;
              }
        }
        return false;
       
    }
    
}
       

        