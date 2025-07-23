class Solution {
    public int maximumGain(String s, int x, int y) {
        int ans = 0;
        if (x > y) {
            Result r1 = removePair(s, 'a', 'b', x);
            Result r2 = removePair(r1.remaining, 'b', 'a', y);
            ans = r1.gain + r2.gain;
        } else {
            Result r1 = removePair(s, 'b', 'a', y);
            Result r2 = removePair(r1.remaining, 'a', 'b', x);
            ans = r1.gain + r2.gain;
        }
        return ans;
    }

    private Result removePair(String s, char first, char second, int value) {
        StringBuilder sb = new StringBuilder();
        int gain = 0;
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == first && c == second) {
                sb.deleteCharAt(sb.length() - 1);
                gain += value;
            } else {
                sb.append(c);
            }
        }
        return new Result(gain, sb.toString());
    }

    private class Result {
        int gain;
        String remaining;

        Result(int gain, String remaining) {
            this.gain = gain;
            this.remaining = remaining;
        }
    }
}
