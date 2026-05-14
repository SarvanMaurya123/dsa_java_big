package array;

import java.util.Arrays;

public class SubarraySum {
   // Function to find a continuous subarray whose sum equals target
public int[] subarraySum(int arr[], int target) {

    // Stores current window sum
    int currentSum = 0;

    // Starting index of sliding window
    int start = 0;

    // Traverse array using end pointer
    for (int end = 0; end < arr.length; end++) {

        // Add current element to window sum
        currentSum += arr[end];

        // If current sum becomes greater than target,
        // shrink window from left side
        while (currentSum > target && start <= end) {

            // Remove left element from current sum
            currentSum -= arr[start];

            // Move start pointer forward
            start++;
        }

        // If current sum matches target,
        // return 1-based index positions
        if (currentSum == target) {
            return new int[]{start + 1, end + 1};
        }
    }

    // If no subarray found, return -1
    return new int[]{-1};
}
    public static void main(String[] args) {
        SubarraySum subarraySum = new SubarraySum();
        int target = 15;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        
        // 2. Wrap the call in Arrays.toString()
        System.out.println(Arrays.toString(subarraySum.subarraySum(arr, target)));
    }
}
