class Solution {
    public int maximumLength(int[] nums) {
        int maxSameParity = Math.max(countParity(nums, 0), countParity(nums, 1));
        int maxAlternating = Math.max(longestAlternating(nums, 0), longestAlternating(nums, 1));
        return Math.max(maxSameParity, maxAlternating);
    }

    // Count how many even or odd numbers in nums (parity: 0 = even, 1 = odd)
    private int countParity(int[] nums, int parity) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == parity) count++;
        }
        return count;
    }

    // Longest subsequence with alternating parity, starting with given parity
    private int longestAlternating(int[] nums, int startParity) {
        int count = 0;
        int expected = startParity;
        for (int num : nums) {
            if (num % 2 == expected) {
                count++;
                expected ^= 1; // Toggle between 0 and 1
            }
        }
        return count;
    }
}
