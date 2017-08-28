class Solution {
    public int[] countBits(int num) {
        int[] rst = new int[num + 1];
        rst[0] = 0;
        for (int i = 1; i < num + 1; i++) {
            rst[i] = rst[i & (i - 1)] + 1;
        }
        return rst;
    }
}