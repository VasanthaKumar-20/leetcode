class Solution {
    public int minimumOperations(int[] nums) {
        int l = nums.length;
        int ans=0;
        while(true)
        {
           int min = Integer.MAX_VALUE;
           boolean allzero=true;
           for(int i=0;i<l;i++)
           {
                if(nums[i]>0)
                {
                    min=Math.min(min,nums[i]);
                    allzero=false;
                }
           }
           if(allzero)
           {
            break;
           }
           for(int i=0;i<l;i++)
           {
            if(nums[i]>0)
            {
                nums[i]-=min;
            }
           }
           ans++;
        }
        return ans;
    }
}