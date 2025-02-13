class Solution {
    public int diagonalSum(int[][] mat) {
        int r = mat.length;
        int ans=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                if(i==j)
                {
                    ans+=mat[i][j];
                }
                if(i!=j&&j==r-i-1)
                {
                    ans+=mat[i][j];
                }
            }
        }
        return ans;
    }
}