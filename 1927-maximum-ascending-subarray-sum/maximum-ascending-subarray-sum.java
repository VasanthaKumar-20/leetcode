class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int ans=0;
        int temp=nums[0];
        if(n<=1)
        {
            return nums[0];
        }
        for(int i=1;i<n;i++)
        {
            ans=Math.max(ans,temp);
            if(nums[i-1]<nums[i])
            {
                temp=temp+nums[i];
            }
            else
            {
                temp=nums[i];
            }
            ans=Math.max(ans,temp);
        }
        return ans;
    }
}