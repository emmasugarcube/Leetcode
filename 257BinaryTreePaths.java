import TreeNode.class


public static class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        
        if(root == null) {
            return paths;
        }
        
        helper(root, String.valueOf(root.val), paths);
        return paths;
        
    }
    
    private void helper(TreeNode root, String path, List<String> paths) {
        if(root == null) {
            return;
        }
        
        if(root.left == null && root.right == null) {
            paths.add(path);
            return;
        }
        
        if(root.left != null) {
            helper(root.left, path + "->" + String.valueOf(root.left.val), paths);
        }
        
        if(root.right != null) {
            helper(root.right, path + "->" + String.valueOf(root.right.val), paths);
        }
    }
}