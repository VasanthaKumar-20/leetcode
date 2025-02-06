class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productMap = new HashMap<>();
        int count = 0;

        // Generate all possible pairs and store the product frequencies
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                if (productMap.containsKey(product)) {
                    int freq = productMap.get(product);
                    count += freq * 8; // Each combination can form 8 tuples
                    productMap.put(product, freq + 1);
                } else {
                    productMap.put(product, 1);
                }
            }
        }
        return count;
    }
}