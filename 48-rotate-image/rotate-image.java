class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int arr[][] = new int[n][n];
        int c=n-1;
        for(int i=0;i<n;i++)
        {
            int r=n-1;
            for(int j=0;j<n;j++)
            {
                arr[i][j]=matrix[r][i];
                r--;
            }
            c--;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=arr[i][j];
            }
        }
    }
}