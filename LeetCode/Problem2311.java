class Solution {
    public int longestSubsequence(String s, int k) {
        int count = 0;
        long value = 0;
        int power = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '0') {
                count++;
                power++;
            } else {
                if (power < 32) {
                    long add = 1L << power;
                    if (value + add <= k) {
                        value += add;
                        count++;
                    }
                    power++;
                } else {
                    power++;
                }
            }
        }
        return count;
    }
}
