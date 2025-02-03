class Solution {
    public int getLucky(String s, int k) {
        int n= s.length();
        int ans1=0;
        for(int i=0;i<n;i++)
        {
            int a = s.charAt(i) - 'a' + 1;
            while(a>0)
            {
                int d = a%10;
                ans1+=d;
                a/=10;
            }
        }

        for(int i=1;i<k;i++)
        {
            int ans2=0;
            while(ans1>0)
            {
                int d = ans1%10;
                ans2+=d;
                ans1/=10;   
            }
            ans1=ans2;
        }
        return ans1;
    }
}