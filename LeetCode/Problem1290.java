class Solution {
    public int getDecimalValue(ListNode head) {
        if (head.next == null) {
            return head.val;
        }
        
        // Step 1: Count the number of bits (nodes)
        ListNode temp = head;
        int list_length = 0;
        while (temp.next != null) {
            list_length++;
            temp = temp.next;
        }
        
        // Step 2: Traverse again and compute decimal value
        temp = head;
        int res = 0;
        while (temp != null) {
            res += temp.val * Math.pow(2, list_length);
            list_length--;
            temp = temp.next;
        }
        
        return res;
    }
}
