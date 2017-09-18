class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null || root.left == null) {
            return -1;
        }
        int ans = -1;
        if (root.left.val > root.val && (ans == -1 || root.left.val < ans)) {
            ans = root.left.val;
        }
        if (root.right.val > root.val && (ans == -1 || root.right.val < ans)) {
            ans = root.right.val;
        }
        int tmp = findSecondMinimumValue(root.left);
        if (tmp > root.val && (ans == -1 || tmp < ans)) {
            ans = tmp;
        }
        tmp = findSecondMinimumValue(root.right);
        if (tmp > root.val && (ans == -1 || tmp < ans)) {
            ans = tmp;
        }
        return ans;
    }
}