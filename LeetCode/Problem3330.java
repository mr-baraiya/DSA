class Solution {
    public int possibleStringCount(String word) {
        if(word.length() == 1){
            return 1;
        }
        int count = 1;
        for (int i=0; i<word.length()-1; i++){
            if(word.charAt(i) == word.charAt(i+1)){
                count += 1;
            }
        }
        return count;
    }
}
