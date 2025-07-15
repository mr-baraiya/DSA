class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        String vowels = "aeiou";
        String consonants = "bcdfghjklmnpqrstvwxyz";
        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char ch : word.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            char lowerCh = Character.toLowerCase(ch);
            if (vowels.indexOf(lowerCh) != -1) {
                hasVowel = true;
            } else if (consonants.indexOf(lowerCh) != -1) {
                hasConsonant = true;
            }
        }

        return hasVowel && hasConsonant;
    }
}
