// Last updated: 2/13/2026, 9:44:38 AM
class Solution {
    public int longestPalindrome(String s) {
        int[] cnt = new int[128];
        for (char c : s.toCharArray()) cnt[c]++;

        int len = 0;
        for (int c : cnt) len += c - (c & 1);

        return len < s.length() ? len + 1 : len;
    }
}
