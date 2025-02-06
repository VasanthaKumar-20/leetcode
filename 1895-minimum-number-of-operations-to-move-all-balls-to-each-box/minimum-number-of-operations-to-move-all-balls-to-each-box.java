class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            int sum = 0;
            for(int j=0;j<n;j++)
            {
                char ch = boxes.charAt(j);
                if(ch=='1')
                {
                    int b = Math.abs(j-i);
                    sum=sum+(b);
                } 
            }
            arr[i]=sum;
        }
        return arr;
    }
}