package dsa;

import java.util.Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] numbers = new int[] {1,5,6,9,3,2};
        int[] maxSubArray = maxSubArray(numbers,3);
        System.out.println(Arrays.toString(maxSubArray));
    }

    public static int[] maxSubArray(int[] array, int k){
        int[] subArray = new int[k];
        int start = 0;
        int end = k-1;
        int maximumSum = 0;
        while (end < array.length){
            int sum = 0;
            for (int i = start; i <= end; i++) sum += array[i];
            if (sum > maximumSum) {
                maximumSum = sum;
                int arrayStart = start;
                for (int j = 0; j < k; j++) subArray[j] = array[arrayStart++];
            }
            start++;
            end++;
        }
        return subArray;
    }
}
