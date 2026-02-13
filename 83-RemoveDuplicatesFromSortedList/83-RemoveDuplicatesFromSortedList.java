// Last updated: 2/13/2026, 9:45:22 AM
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;

        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;   
            } else {
                cur = cur.next;             
            }
        }
        return head;
    }
}
