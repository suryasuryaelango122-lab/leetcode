// Last updated: 2/13/2026, 9:45:51 AM
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
    ListNode dummy = new ListNode(0), cur = dummy;

    while (true) {
        int idx = -1;
        for (int i = 0; i < lists.length; i++)
            if (lists[i] != null && (idx < 0 || lists[i].val < lists[idx].val))
                idx = i;

        if (idx < 0) break;
        cur.next = lists[idx];
        cur = cur.next;
        lists[idx] = lists[idx].next;
    }
    return dummy.next;
}
}