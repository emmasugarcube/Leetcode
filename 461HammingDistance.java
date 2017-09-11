class Solution {
    public int hammingDistance(int x, int y) {
        int rst = 0;
        int exc = x ^ y;
        for (int i = 0; i < 32; i++) {
            rst += (exc >> i) & 1;
        }
        return rst;
    }
}