import java.util.Arrays;

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        int evenSize = (n + 1) / 2;
        int oddSize = n / 2;
        
        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];

        // Separate even and odd indexed elements
        for (int i = 0, e = 0, o = 0; i < n; i++) {
            if (i % 2 == 0) {
                even[e++] = nums[i];
            } else {
                odd[o++] = nums[i];
            }
        }

        // Sort even in ascending order, odd in descending order
        Arrays.sort(even);
        Arrays.sort(odd);
        
        // Place back into nums
        for (int i = 0, e = 0, o = odd.length - 1; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = even[e++];
            } else {
                nums[i] = odd[o--];
            }
        }

        return nums;
    }
}
