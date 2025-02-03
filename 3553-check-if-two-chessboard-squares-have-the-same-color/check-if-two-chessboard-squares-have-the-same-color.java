class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int sc1 = (int) coordinate1.charAt(0);
        int sc2 = (int) coordinate2.charAt(0);
        int sd1 = Integer.parseInt(String.valueOf(coordinate1.charAt(1)));
        int sd2 = Integer.parseInt(String.valueOf(coordinate2.charAt(1)));
        int ans1 = func(sc1,sd1);
        int ans2 = func(sc2,sd2);
        return ans1==ans2;
    }

    static int func(int sc1,int sd1)
    {
        if(sc1%2!=0)
        {
            if(sd1%2==0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            if(sd1%2==0)
            {
                return 0;
            }
            else
            {
                return 1;
            }   
        }
    }

}