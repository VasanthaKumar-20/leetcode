class Solution {
    public String removeDuplicates(String s) {
        int i=0;
        while(i<s.length()-1)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                s=s.substring(0,i)+s.substring(i+2);
                i=Math.max(i-1,0);
            }
            else
            {
                i++;
            }
        }
        return s;
    }
}