class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] num3 = new int[n1+n2];
        int j=0; 
        for(int i=0;i<n1;i++)
        {
            num3[j]=nums1[i];
            j++;
        }
        for(int i=0;i<n2;i++)
        {
            num3[j]=nums2[i];
            j++;
        }
        Arrays.sort(num3);
        if(num3.length%2!=0)
        {
            double ans = (double) num3[(j-1)/2];
            return ans;
        }
        else
        {
            int f = num3[j/2];
            int s = num3[(j-1)/2];
            double ans = (double) (f+s)/2;
            return ans;
        }
    }
}