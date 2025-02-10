class Solution {
    public String clearDigits(String s) {
        StringBuilder build = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                if(build.length()>0)
                {
                    build.deleteCharAt(build.length()-1);
                }
            }
            else
            {
                build.append(ch);
            }
        }
        return build.toString();
    }
}