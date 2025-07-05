import java.util.*;

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);
        }

        int max = -1;
        for (int num : count.keySet()) {
            if (num == count.get(num)) {
                max = Math.max(max, num);
            }
        }

        return max;
    }
}
