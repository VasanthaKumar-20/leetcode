class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] ans = new int[n1];
        int c=0;
        for(int i=0;i<n2;i++)
        {
            for(int j=0;j<n1;j++)
            {
                if(arr2[i]==arr1[j])
                {
                    ans[c]=arr1[j];
                    arr1[j]=-1;
                    c++;
                }
            }
        }
        Arrays.sort(arr1);
        for(int i=0;i<n1;i++)
        {
            if(arr1[i]>=0)
            {
                ans[c]=arr1[i];
                c++;
            }
        }       
        return ans;
    }
}