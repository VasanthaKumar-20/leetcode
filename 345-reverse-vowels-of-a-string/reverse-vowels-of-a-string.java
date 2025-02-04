class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        String ans="";
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                stack.push(ch);
            }
        }
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                ans=ans+stack.pop();
            }
            else
            {
                ans=ans+ch;
            }
        }
        return ans;
    }
}