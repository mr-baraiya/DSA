class Solution {
    public int maxSum(int[] nums) {
        // Step 1: Sort the array in ascending order
        Arrays.sort(nums);

        // Step 2: Initialize sum with the last (largest) element
        int sum = nums[nums.length - 1];

        // Step 3: Store the previous added element to skip duplicates
        int prev = sum;

        // Step 4: Traverse the array in reverse (from second last to beginning)
        // Only consider non-negative numbers
        for (int i = nums.length - 2; i >= 0 && nums[i] >= 0; prev = nums[i], i--) {
            // Step 5: Add to sum only if the current number is different from previous
            if (nums[i] != prev)
                sum += nums[i];
        }

        // Step 6: Return the final sum of unique non-negative elements
        return sum;
    }
}
