class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] copy = arr.clone(); 
        int j = 0;

        for (int i = 0; i < n && j < n; i++) {
            arr[j] = copy[i];
            if (copy[i] == 0 && j + 1 < n) { 
                arr[j + 1] = 0;
                j++;
            }
            j++;
        }
    }
}
