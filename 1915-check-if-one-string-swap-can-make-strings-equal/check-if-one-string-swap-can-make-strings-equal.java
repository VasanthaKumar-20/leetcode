class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n1 = s1.length();
        int c=0;
        if(s1.equals(s2))
        {
            return true;
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n1;i++)
        {
            if(c>2)
            {
                return false;
            }
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch1!=ch2)
            {
                c++;
                stack.push(i);
            }
        }
        if(stack.isEmpty())
        {
            return false;
        }
        int a = stack.pop();
        if(stack.isEmpty())
        {
            return false;
        }
        int b = stack.pop();
        if(s1.charAt(a)==s2.charAt(b) && s2.charAt(a)==s1.charAt(b))
        {
            return true;
        } 
        
        return false;
    }
}