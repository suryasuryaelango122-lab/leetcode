// Last updated: 2/13/2026, 9:44:47 AM
class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for (char x : s.toCharArray()) c ^= x;
        for (char x : t.toCharArray()) c ^= x;
        return c;
    }
}
