class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n < 0){
        //     return false;
        // }
        // ArrayList<Integer> TwoSPow = new ArrayList<>();
        // for(int i=0;i<32;i++){
        //     TwoSPow.add( 1 << i );
        // }
        // return TwoSPow.contains(n);
        if (n <= 0) return false;
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
}
