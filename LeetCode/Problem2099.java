import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        
        // Step 1: Store nums with their indices
        int[][] indexedNums = new int[n][2];
        for (int i = 0; i < n; i++) {
            indexedNums[i][0] = nums[i]; // value
            indexedNums[i][1] = i;       // index
        }

        // Step 2: Sort by value descending
        Arrays.sort(indexedNums, (a, b) -> Integer.compare(b[0], a[0]));

        // Step 3: Take top k elements
        Arrays.sort(indexedNums, 0, k, (a, b) -> Integer.compare(a[1], b[1]));

        // Step 4: Build result
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = indexedNums[i][0];
        }

        return result;
    }
}
