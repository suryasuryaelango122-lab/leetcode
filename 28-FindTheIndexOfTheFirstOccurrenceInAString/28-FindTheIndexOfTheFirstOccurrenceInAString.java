// Last updated: 2/13/2026, 9:45:44 AM
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        // We only need to check until n-m index (inclusive)
        for (int i = 0; i <= n - m; i++) {
            // Check if substring from i to i+m equals needle
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;  // first match
            }
        }
        
        return -1; // no match found
    }
}
