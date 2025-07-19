class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        arr[0]=-1;
        arr[1]=-1;
        int z=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target && arr[0]==-1)
            {
                arr[0]=i;
            }
            else if(nums[i]==target)
            {
                arr[1]=i;
            }
        }
        if(arr[1]==-1 && arr[0]!=-1)
        {
            arr[1]=arr[0];
        }
        return arr;
    }
}