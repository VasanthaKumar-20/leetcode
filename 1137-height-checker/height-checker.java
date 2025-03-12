class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] exp = Arrays.copyOf(heights,n);
        Arrays.sort(exp);
        int ans=0;
        for(int i=0;i<n;i++)
        {
            System.out.println(heights[i]);
            System.out.println(exp[i]);
            if(heights[i]!=exp[i])
            {
                ans++;
            }
        }
        return ans;
    }
}