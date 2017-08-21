class Solution {
    List<Integer> ans = new ArrayList<Integer>();
    public List<Integer> largestValues(TreeNode root) {
        
        bfs(root, 0);
        return ans;
    }
    
    public void bfs(TreeNode root, int depth) {
        if (root == null) {
                return;
        }
        if (ans.size() == depth) {
            ans.add(root.val);
        } else {
            if(ans.get(depth) < root.val) {
                ans.set(depth, root.val);
            }
        }
        bfs (root.left, depth + 1);
        bfs (root.right, depth + 1);
    }
}