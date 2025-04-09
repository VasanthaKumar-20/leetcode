class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int z=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==k)
            {
                z=1;
            }
            if(nums[i]<k)
            {
                return -1;
            }
            set.add(nums[i]);
        }
        if(z==1)
        {
            return set.size()-1;
        }
        return set.size();    
    }
}