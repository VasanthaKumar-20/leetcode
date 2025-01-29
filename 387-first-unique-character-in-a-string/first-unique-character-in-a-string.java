class Solution {
    public int firstUniqChar(String s) {
        int l = s.length();
        if(l<=1)
        {
            return 0;
        }
        for(int i=0;i<l;i++)
        {
            boolean istrue = true;
            for(int j=0;j<l;j++)
            {
               if(s.charAt(i)==s.charAt(j) && i!=j)
               {
                    istrue=false;
                    break;
               }
            }
            if(istrue)
            {
                return i;
            }
        }
        return -1; 
    }
}