class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==c)
            {
                count++;
            }
        }
        int[] arr = new int[count];
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==c)
            {
                arr[k]=i;
                k++;
            }
        }
        for(int i=0;i<n;i++)
        {
            ans[i]=n;
            for(int j=0;j<arr.length;j++)
            {
                int z = Math.abs(arr[j]-i);
                if(z<ans[i])
                {
                    ans[i]=z;
                }
            }
        }
        return ans;
    }
}