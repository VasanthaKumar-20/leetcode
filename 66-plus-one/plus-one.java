class Solution {
    public int[] plusOne(int[] digits) {
        int l=digits.length;
        for(int i=l-1;i>=0;i--)
        {
            if(digits[i]==9)
            {
                digits[i]=0;
            }
            else
            {
                digits[i]++;
                return digits;
            }
        }
        digits = new int[l+1];
        digits[0] = 1;
        return digits;
    }
}