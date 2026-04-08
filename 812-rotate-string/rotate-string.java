class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        {
            return false;

        }
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            String p1=s.substring(0,i);
            String p2=s.substring(i);
            String temp=p2+p1;
            if(temp.equals(goal))
            return true;
        }
        return false;
        }
}