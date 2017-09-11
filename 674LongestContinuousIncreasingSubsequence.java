class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int max = 0;
        int[] dp = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            
            if (i == 0) {
                dp[i] = 1;
                max = 1;
                continue;
            }
            if (nums[i] > nums[i - 1]) {
                dp[i] = Math.max(dp[i], dp[i - 1] + 1);
            } else {
                dp[i] = 1;
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}