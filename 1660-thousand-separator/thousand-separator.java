import java.util.*;
class Solution {
    public String thousandSeparator(int n) {
        String str = Integer.toString(n);
        if(n<1000)
        {
            return str;
        }
        Stack<String> stack = new Stack<>();
        int len = str.length();
        while(len>3)
        {
            String d = str.substring(len-3,len);
            stack.push(d);
            str = str.substring(0,len-3);
            len = str.length();            
        }
        while(!stack.isEmpty())
        {
            str=str+"."+stack.pop();
        }
        return str;
    }
}