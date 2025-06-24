import java.util.*;

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        int r = 0; // next index to be judged
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] == key) {
                int l = Math.max(r, i - k);
                r = Math.min(n - 1, i + k) + 1;
                for (int j = l; j < r; j++) {
                    res.add(j);
                }
            }
        }

        // Remove duplicates and sort
        Set<Integer> set = new HashSet<>(res);
        List<Integer> ans = new ArrayList<>(set);
        Collections.sort(ans);
        return ans;
    }
}
