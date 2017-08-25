/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        if(root == null) {
            return rst;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                level.add(head.val);
                if(head.left != null) {
                    queue.offer(head.left);
                }
                if(head.right != null) {
                    queue.offer(head.right);
                }
                
            }
            rst.add(level);
        }
        
        return rst;
        
    }
}