class Solution {
    public int numOfArrays(int n, int m, int k) {
        Integer[][][] dp = new Integer[n + 1][m + 1][k + 1];
        return dfs(n, m, k, 0, 0, 0, dp);
    }

    int dfs(int n, int m, int k, int i, int currMax, int currCost, Integer[][][] dp) {
        if (i == n) {
            if (k == currCost) return 1;
            return 0;
        }
        if (dp[i][currMax][currCost] != null) return dp[i][currMax][currCost];
        int ans = 0;
        ans += (long) currMax * dfs(n, m, k, i + 1, currMax, currCost, dp) % 1_000_000_007;

        if (currCost + 1 <= k) {
            for (int num = currMax + 1; num <= m; num++) {
                ans += dfs(n, m, k, i + 1, num, currCost + 1, dp);
                ans %= 1_000_000_007;
            }
        }
        return dp[i][currMax][currCost] = ans;
    }
}