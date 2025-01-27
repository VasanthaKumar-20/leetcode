import java.util.*;
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int len = nums.length;
        int c=0;
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<len;i++)
        {
            if(nums[i]%2==0)
            {
                even.add(nums[i]);
            }
            else
            {
                odd.add(nums[i]);
            }
        }
        for(int i=0;i<len;i=i+2)
        {
            nums[i]=even.get(c);
            nums[i+1]=odd.get(c);
            c++;
        }
        return nums;
    }
}