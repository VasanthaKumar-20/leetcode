class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int ans=0;
        for(int i=0;i<n-1;i++)
        {
            int left=0,right=0;
            for(int j=0;j<=i;j++)
            {
                left=left+nums[j];
            }
            for(int j=i+1;j<n;j++)
            {
                right=right+nums[j];
            }
            if((left-right)%2==0)
            {
                ans++;
            }
        }
        return ans;
    }
}