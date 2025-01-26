class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f=0,ten=0,twe=0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                f++;
            }
            if(bills[i]==10)
            {
                ten++;
                if(f<=0)
                {
                    return false;
                }
                f--;
            }
            if(bills[i]==20)
            {
                twe++;
                if(f>=1 && ten>=1)
                {
                    ten--;
                    f--;
                }
                else if(f>=3)
                {
                    f=f-3;
                }
                else
                {
                   return false;
                }
            }
        }
        return true;
    }
}