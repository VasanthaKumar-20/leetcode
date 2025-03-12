class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(nums1[i]==nums2[j] && !list.contains(nums1[i]))
                {
                    list.add(nums1[i]);
                    break;
                }
            }
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            ans[i]=list.get(i);
        }
        return ans;
    }
}