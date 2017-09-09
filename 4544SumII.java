class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int l = A.length;
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (hm.containsKey(A[i] + B[j])) {
                    hm.put(A[i] + B[j], hm.get(A[i] + B[j]) + 1);
                } else {
                    hm.put(A[i] + B[j], 1);
                }
            }
        }
        int rst = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (hm.containsKey(-C[i] - D[j])) {
                    rst = rst + hm.get(-C[i] - D[j]);
                }
            }
        }
        return rst;                
    }
}