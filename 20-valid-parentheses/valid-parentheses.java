class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<len;i++)
        {
            char ch = s.charAt(i);
            if(ch=='(')
            {
                stack.push(')');
            }
            else if(ch=='[')
            {
                stack.push(']');
            }
            else if(ch=='{')
            {
                stack.push('}');
            }
            else if(stack.isEmpty() || stack.pop()!=ch)
              {
                return false;
              }  
        }
        return stack.isEmpty();
    }
}