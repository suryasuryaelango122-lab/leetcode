// Last updated: 2/13/2026, 9:46:40 AM
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummyHead = new ListNode(0); 
        ListNode current = dummyHead; 
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0; 
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int digit = sum % 10;
            current.next = new ListNode(digit); 
            current = current.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return dummyHead.next;
    }
}