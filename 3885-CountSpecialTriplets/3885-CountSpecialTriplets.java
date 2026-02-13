// Last updated: 2/13/2026, 9:44:23 AM
class Solution {
    static final long MOD = 1_000_000_007L;

    public int specialTriplets(int[] a) {
        Map<Integer, Long> L = new HashMap<>(), R = new HashMap<>();
        for (int x : a) R.merge(x, 1L, Long::sum);

        long ans = 0;
        for (int x : a) {
            R.merge(x, -1L, Long::sum);
            ans = (ans + L.getOrDefault(x * 2, 0L) * R.getOrDefault(x * 2, 0L)) % MOD;
            L.merge(x, 1L, Long::sum);
        }
        return (int) ans; // cast to int for the caller
    }
}
