class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        long[] rst = new long[nums.length + 1];
        rst[0] = 0;
        rst[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            rst[i] = Math.max(rst[i - 1], rst[i - 2] + nums[i - 1]);
        }
        return (int) rst[nums.length];
    }
}