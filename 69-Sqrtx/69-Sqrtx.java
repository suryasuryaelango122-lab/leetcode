// Last updated: 2/13/2026, 9:45:30 AM
class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        int l = 1, r = x/2, ans = 0;
        while (l <= r) {
            int m = l + (r-l)/2;
            if (m <= x/m) { ans = m; l = m+1; }
            else r = m-1;
        }
        return ans;
    }
}
