class FindSumPairs {
    private int[] nums1;
    private int[] nums2;
    private Map<Integer, Integer> freqMap2;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;

        freqMap2 = new HashMap<>();
        for (int num : nums2){
            freqMap2.put(num,freqMap2.getOrDefault(num,0)+1);
        }

    }
    
    public void add(int index, int val) {
        int oldVal = nums2[index];
        int newVal = oldVal + val;

        freqMap2.put(oldVal,freqMap2.get(oldVal) - 1);
        if (freqMap2.get(oldVal) == 0) {
            freqMap2.remove(oldVal);
        }

        nums2[index] = newVal;
        freqMap2.put(newVal, freqMap2.getOrDefault(newVal, 0) + 1);
    }
    
    public int count(int tot) {
        int result = 0;

        for (int num : nums1){
            int complement = tot - num;
            result += freqMap2.getOrDefault(complement, 0);
        }
        return result;
    }
}
