// Last updated: 2/13/2026, 9:45:36 AM
class Solution {
    public int minPathSum(int[][] g) {
        int m = g.length, n = g[0].length;
        for (int i = 1; i < n; i++) g[0][i] += g[0][i-1];
        for (int i = 1; i < m; i++) g[i][0] += g[i-1][0];
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                g[i][j] += Math.min(g[i-1][j], g[i][j-1]);
        return g[m-1][n-1];
    }
}
