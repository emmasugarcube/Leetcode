class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }
        int lastBit = xor - (xor & (xor - 1));
        int group0 = 0;
        int group1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((lastBit & nums[i]) == 0) {
                group0 ^= nums[i];
            } else {
                group1 ^= nums[i];
            }
        }
        
        int[] rst = new int[2];
        rst[0] = group0;
        rst[1] = group1;
        return rst;
    }
}