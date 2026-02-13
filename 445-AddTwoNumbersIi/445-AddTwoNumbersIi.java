// Last updated: 2/13/2026, 9:44:44 AM
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>(), s2 = new Stack<>();
        while (l1 != null) { s1.push(l1.val); l1 = l1.next; }
        while (l2 != null) { s2.push(l2.val); l2 = l2.next; }

        ListNode head = null;
        for (int carry = 0; !s1.isEmpty() || !s2.isEmpty() || carry != 0; ) {
            if (!s1.isEmpty()) carry += s1.pop();
            if (!s2.isEmpty()) carry += s2.pop();
            ListNode node = new ListNode(carry % 10);
            node.next = head;
            head = node;
            carry /= 10;
        }
        return head;
    }
}
