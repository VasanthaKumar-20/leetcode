import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int l = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<l;i++)
        {
            int c=1;
            for(int j=i+1;j<l;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
                else
                {
                    break;
                }
            }
            if(list.contains(c))
            {
                return false;
            }
            list.add(c);
            i=i+c-1;
        }
        return true;
    }
}