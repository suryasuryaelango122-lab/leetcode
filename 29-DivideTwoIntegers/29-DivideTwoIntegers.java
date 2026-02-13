// Last updated: 2/13/2026, 9:45:43 AM
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        boolean neg = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long) dividend), b = Math.abs((long) divisor), res = 0;

        while (a >= b) {
            long temp = b, mul = 1;
            while (a >= (temp << 1)) {
                temp <<= 1;
                mul <<= 1;
            }
            a -= temp;
            res += mul;
        }

        return (int)(neg ? -res : res);
    }
}
