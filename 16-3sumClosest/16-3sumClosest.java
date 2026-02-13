// Last updated: 2/13/2026, 9:46:25 AM
class Solution {
    public int threeSumClosest(int[] a, int t) {
        Arrays.sort(a);
        int best = a[0] + a[1] + a[2];
        for (int i = 0; i < a.length - 2; i++) {
            int l = i + 1, r = a.length - 1;
            while (l < r) {
                int sum = a[i] + a[l] + a[r];
                if (Math.abs(sum - t) < Math.abs(best - t)) best = sum;
                if (sum < t) l++;
                else if (sum > t) r--;
                else return sum;
            }
        }
        return best;
    }
}
