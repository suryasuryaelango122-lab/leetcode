// Last updated: 2/13/2026, 9:46:36 AM
class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length(), sign = 1;
        long num = 0;

        while (i < n && s.charAt(i) == ' ') i++;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-'))
            sign = s.charAt(i++) == '-' ? -1 : 1;

        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + s.charAt(i++) - '0';
            if (sign == 1 && num >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -num <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int)(num * sign);
    }
}
