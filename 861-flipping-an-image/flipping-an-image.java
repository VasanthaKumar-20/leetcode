class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] ans = new int[n][n];
        int r=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=n-1;j>=0;j--)
            {
                if(image[i][j]==0)
                {
                    ans[r][c]=1;
                }
                else if(image[i][j]==1)
                {
                    ans[r][c]=0;
                }
                c++;
            }
            r++;
        }
        return ans;
    }
}