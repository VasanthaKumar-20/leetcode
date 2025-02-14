import java.util.ArrayList;

class ProductOfNumbers {
    private ArrayList<Integer> prefixProduct;

    public ProductOfNumbers() {
        prefixProduct = new ArrayList<>();
        prefixProduct.add(1); // Base case to handle division
    }

    public void add(int num) {
        if (num == 0) {
            prefixProduct.clear();
            prefixProduct.add(1); // Reset due to zero
        } else {
            prefixProduct.add(prefixProduct.get(prefixProduct.size() - 1) * num);
        }
    }

    public int getProduct(int k) {
        int n = prefixProduct.size();
        if (k >= n) return 0; // If k exceeds available numbers, return 0
        return prefixProduct.get(n - 1) / prefixProduct.get(n - k - 1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */