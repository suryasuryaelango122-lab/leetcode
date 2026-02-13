// Last updated: 2/13/2026, 9:44:26 AM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int s = 0, n = x;
        while (n > 0) { s += n % 10; n /= 10; }
        return x % s == 0 ? s : -1;
    }
}
