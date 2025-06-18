class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int res[][] = new int[n / 3][3]; // Allocate space for result

        for (int i = 0; i < n; i += 3) {
            int a = nums[i];
            int b = nums[i + 1];
            int c = nums[i + 2];
            if (c - a > k) {
                return new int[0][0]; // Return empty 2D array if condition fails
            }
            res[i / 3][0] = a;
            res[i / 3][1] = b;
            res[i / 3][2] = c;
        }

        return res;
    }
}
