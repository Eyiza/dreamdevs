package dsa;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelfAlgorithm(int[] nums) {
        int n = nums.length;
        int[] products = new int[n];

        int products_left = 1;
        for (int i = 0; i < n; i++) {
            products[i] = products_left;
            products_left *= nums[i];
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
