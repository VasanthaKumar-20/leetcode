class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int len = operations.length;
        int ans=0;
        for(int i=0;i<len;i++)
        {
            String s= operations[i];
            if(s.equals("C"))
            {
                stack.pop();
            }
            else if(s.equals("D"))
            {
                int dou = stack.peek() * 2;
                stack.push(dou);
            }
            else if(s.equals("+"))
            {
                int f = stack.pop();
                int se = stack.peek();
                stack.push(f);
                int plu = f+se;
                stack.push(plu);
            }
            else
            {
                stack.push(Integer.parseInt(s));
            }
        }
        while(!stack.isEmpty())
        {
            ans=ans+stack.pop();
        }
        return ans;
    }
}