class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        if(n==0)
        {
            return 0;
        }
        int ans=1;
        int inc=1,dec=1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]>nums[i-1])
            {
                dec=1;
                inc++;
            }
            else if(nums[i]<nums[i-1])
            {
                inc=1;
                dec++;
            }
            else
            {
                inc=1;
                dec=1;
            }
            ans=Math.max(ans,Math.max(inc,dec));
        }
        return ans;
   }
}