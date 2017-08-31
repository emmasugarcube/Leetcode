class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String s : strs) {
            int[] cost = count(s);
            for (int i = m; i >= cost[0]; i--) {
                for (int j = n; j >= cost[1]; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - cost[0]][j - cost[1]] + 1);
                }
            }
        }
        return dp[m][n];
        
    }
    
    private int[] count (String s) {
        int[] cost = new int[2];
        for (int i = 0; i < s.length(); i++) {
            cost[s.charAt(i) - '0']++;
        }
        return cost;
    }
}