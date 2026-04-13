class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        int n=chars.length;
        int i=0;
       
        while(i<n)
        {
            char curr=chars[i];
             int count=0;
             while(i<n && chars[i]==curr)
             {
                i++;
                count++;
             }
             sb.append(curr);
             if(count>1)
             {
                sb.append(count);
             }
             for(int j=0;j<sb.length();j++)
             {
                  chars[j]=sb.charAt(j);
             }

        }
        return sb.length();
    }
}