import java.util.*;
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int len = nums.length,e=0,o=1;
        int[] ans = new int[len];
        for(int i=0;i<len;i++)
        {
            if(nums[i]%2==0)
            {
                ans[e] = nums[i];
                e+=2;
            }
            else
            {
                ans[o] = nums[i];
                o+=2;
            }
        }
        return ans;
    }
}