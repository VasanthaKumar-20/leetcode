class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int a=nums[i];
            int count=0;
            for(int j=i+1;j<n;j++)
            {
                if(a+1==nums[j])
                {
                    a=nums[j];
                    count++;
                }
                else
                {
                    break;
                }
            }
            if(count>=1)
            {
                String str=Integer.toString(nums[i])+"->"+Integer.toString(a);
                list.add(str);
            }
            else
            {

                list.add(Integer.toString(nums[i]));
            }
            i=i+count;
        }
        return list;
    }
}