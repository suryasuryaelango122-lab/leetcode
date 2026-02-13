// Last updated: 2/13/2026, 9:46:28 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String p = strs[0];
        for (String s : strs)
            while (!s.startsWith(p))
                p = p.substring(0, p.length() - 1);
        return p;
    }
}
