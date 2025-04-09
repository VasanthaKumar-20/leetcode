class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] sorted = score.clone();
        Arrays.sort(sorted);
        String[] ans = new String[n];
        int c=0;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(sorted[i]==score[j])
                {
                    c++;
                    if(c==1)
                    {
                        ans[j]="Gold Medal";
                    }
                    else if(c==2)
                    {
                        ans[j]="Silver Medal";
                    }
                    else if(c==3)
                    {
                        ans[j]="Bronze Medal";
                    }
                    else
                    {
                        ans[j]=Integer.toString(c);
                    }
                }
            }
        }
        return ans;
    }
}