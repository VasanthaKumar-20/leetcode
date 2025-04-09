class Solution {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        int n = moves.length();
        for(int i=0;i<n;i++)
        {
            if(moves.charAt(i)=='U')
            {
                x++;
            }
            if(moves.charAt(i)=='D')
            {
                x--;
            }
            if(moves.charAt(i)=='L')
            {
                y++;
            }
            if(moves.charAt(i)=='R')
            {
                y--;
            }
        }
        if(x==0 && y==0)
        {
            return true;
        }
        return false;
    }
}