/* Lowest Common Ancestor of a Binary Search Tree:
Given binary search tree:  root = [6,2,8,0,4,7,9,null,null,3,5]
p = 2, q = 8
*/

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(p.val < root.val && q.val < root.val){
            lowestCommonAncestor(root.left, p, q);
        } else if(p.val > root.val && q.val > root.val){
            lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }
}

