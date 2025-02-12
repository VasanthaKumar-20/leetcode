// Time limit exceeded at 55th test case out of 83
// class Solution {
//     public int maximumSum(int[] nums) {
//         int ans=-1,a,b;
//         int n = nums.length;
//         for(int i=0;i<n-1;i++)
//         {
//             int num1 = nums[i];
//             a = 0;
//             while(num1>0)
//             {
//                 a=a+(num1%10);
//                 num1/=10;
//             }
//             for(int j=i+1;j<n;j++)
//             {
//                 int num2 = nums[j];
//                 b = 0;
//                 while(num2>0)
//                 {
//                     b=b+(num2%10);
//                     num2/=10;
//                 }
//                 System.out.println(a);
//                 System.out.println(b);
//                 if(a==b)
//                 {
//                     int c = nums[i]+nums[j];
//                     ans=Math.max(ans,c);
//                 }
//             }
//         }
//         return ans;
//     }
// }



class Solution {
    public int maximumSum(int[] nums) {
        int[] maxNums = new int[82]; // Array to store max value for each digit sum
        int maxSum = -1;

        for (int num : nums) {
            int digitSum = getDigitSum(num);

            // If a number with this digit sum exists, update maxSum
            if (maxNums[digitSum] > 0) {
                maxSum = Math.max(maxSum, num + maxNums[digitSum]);
            }

            // Store the maximum number for this digit sum
            maxNums[digitSum] = Math.max(maxNums[digitSum], num);
        }

        return maxSum;
    }

    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
