class Solution {
    public boolean checkIfExist(int[] arr) {
        int l = arr.length;
        if(l<2)
        {
            return false;
        }
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(i!=j && arr[i]==arr[j]*2)
                {
                    return true;
                }
            }
        }
        return false;
    }
}