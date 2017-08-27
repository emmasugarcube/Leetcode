class Solution {
    public int maximalRectangle(boolean[][] A) {
        // A is boolean
        // when calculating left and right, check A[i-1][j] is true
        if (A==null||A.length==0||A[0].length==0) {
            return 0;
        }
        int m = A.length;
        int n = A[0].length;
        int[][] up = new int[m][n];
        int[][] left = new int[m][n];
        int[][] right = new int[m][n];
        int i, j, k, l, r, res = 0;
        
        for (i=0; i<m; ++i) {
            // calc up
            for (j=0; j<n; ++j) {
                if (!A[i][j]) {
                    up[i][j] = 0;
                }
                else {
                    up[i][j] = 1;
                    if (i>0) {
                        up[i][j] += up[i-1][j];
                    }
                }
            }
            
            // calc left
            l = 0;
            for (j=0; j<n; ++j) {
                if (!A[i][j]) {
                    l = left[i][j] = 0;
                }
                else {
                    ++l;
                    left[i][j] = l;
                    if (i>0&&A[i-1][j]&&left[i-1][j] < left[i][j]) {
                        left[i][j] = left[i-1][j];
                    }
                }
            }
            
            // calc right
            r=0;
            for (j=n-1; j>=0; --j) {
                if (!A[i][j]) {
                    r = right[i][j] = 0;
                }
                else {
                    ++r;
                    right[i][j] = r;
                    if (i>0&&A[i-1][j]&&right[i-1][j] < right[i][j]) {
                        right[i][j] = right[i-1][j];
                    }
                }
            }
        }
        
        for (i=0; i<m; ++i) {
            for (j=0; j<n; ++j) {
                res = Math.max(res, up[i][j] * (left[i][j] + right[i][j] - 1));
            }
        }
        
        return res;
    }

}