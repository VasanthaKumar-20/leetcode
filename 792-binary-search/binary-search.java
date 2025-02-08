class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return func(0,n-1,target,nums);
    }
    public static int func(int start,int end,int target,int[] nums)
    {
        if(start>end)
        {
            return -1;
        }
        int mid = start + (end-start)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        else if(nums[mid]>target)
        {
            return func(start,mid-1,target,nums);
        }
        else 
        {
            return func(mid+1,end,target,nums);
        }
    }
}