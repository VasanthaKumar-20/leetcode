class Solution {
    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (canSplit(Integer.toString(square), i, 0, 0)) {
                sum += square;
            }
        }
        return sum;
    }

    private boolean canSplit(String str, int target, int index, int currentSum) {
        if (index == str.length()) {
            return currentSum == target;
        }

        int num = 0;
        for (int i = index; i < str.length(); i++) {
            num = num * 10 + (str.charAt(i) - '0'); 
            if (canSplit(str, target, i + 1, currentSum + num)) {
                return true;
            }
        }
        return false;
    }
}
