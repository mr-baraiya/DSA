import java.util.Arrays;

class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int maxLength = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] - nums[start] > 1) {
                start++;
            }
            if (nums[i] - nums[start] == 1) {
                maxLength = Math.max(maxLength, i - start + 1);
            }
        }
        return maxLength;
    }
}
