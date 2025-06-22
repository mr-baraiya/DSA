class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int totalParts = (n + k - 1) / k; // Ceiling division
        String[] result = new String[totalParts];

        int index = 0;
        for (int i = 0; i < n; i += k) {
            String chunk = "";
            for (int j = i; j < i + k; j++) {
                if (j < n) {
                    chunk += s.charAt(j);
                } else {
                    chunk += fill;
                }
            }
            result[index++] = chunk;
        }

        return result;
    }
}
