import java.util.HashSet;

public class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int left = 0;
        int currentSum = 0;
        int maxSum = 0;

        for (int right = 0; right < nums.length; right++) {
            // If nums[right] is a duplicate, move left pointer and update sum
            while (seen.contains(nums[right])) {
                seen.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }

            // Add the current unique element
            seen.add(nums[right]);
            currentSum += nums[right];

            // Update maxSum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
