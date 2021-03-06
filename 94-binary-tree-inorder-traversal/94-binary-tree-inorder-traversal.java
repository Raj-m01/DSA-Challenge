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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        Stack<TreeNode> stack = new Stack();
        List<Integer> ans = new ArrayList();
        
        while(!stack.isEmpty() || root!=null){
            
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            
            if(!stack.isEmpty()){
                ans.add(stack.peek().val);
                root = stack.pop().right;
            }
            
        }
        
        
       return ans; 
    }
}