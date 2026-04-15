package dsa;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelfAlgorithm(int[] nums) {
        int n = nums.length;
        int[] products = new int[n];

        products[0] = 1;
        for (int i = 1; i < n; i++) {
            products[i] = products[i-1] * nums[i-1];
        }
        // System.out.print(Arrays.toString(products));

        int product_right = 1;
        for (int i = n-1; i >= 0; i--) {
            products[i] *= product_right;
            product_right *= nums[i];
        }

        return products;
    }
}
