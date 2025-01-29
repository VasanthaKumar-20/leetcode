class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] ans = new int[c][r];
        int a=0;
        for(int i=0;i<r;i++)
        {
            int b=0;
            for(int j=0;j<c;j++)
            {
                ans[j][i] = matrix[a][b];
                b++;
            }
            a++;
        }
        return ans;
    }
}