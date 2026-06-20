/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null){
            List<List<Integer>> temp = new ArrayList<>();
            return temp;
        }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        List<List<Integer>> level = new ArrayList<>();
        while(q.size() > 0){
            int currsize = q.size();
            List<Integer> curr = new ArrayList<>();
            while(currsize-- > 0){
                root = q.poll();
                if(root.left!=null) q.add(root.left);
                if(root.right!=null) q.add(root.right);
                curr.add(root.val);
            }
            level.addFirst(curr);
        }
        return level;
    }
}