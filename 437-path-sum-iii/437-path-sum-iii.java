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
    public int dfs(TreeNode root, long targetSum){
        if(root == null) return 0;
        targetSum = targetSum- root.val;
        int count =0;
        if(targetSum ==0) count ++;
        
        count = count + dfs(root.left, targetSum)+ dfs(root.right, targetSum);
        return count;
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root== null) return 0;
        return dfs(root, 1l* targetSum)+pathSum(root.left, targetSum)+pathSum (root.right, targetSum);
    }
}