class Solution {
    public char kthCharacter(int k) {
        String word = "a";

        while (word.length() <= k) {
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                char shifted = (char) ((ch - 'a' + 1) % 26 + 'a');
                res.append(shifted);
            }
            word += res.toString();
        }

        return word.charAt(k-1);
    }
}
