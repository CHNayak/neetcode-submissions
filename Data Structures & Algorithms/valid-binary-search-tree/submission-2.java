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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);
        boolean rt = true;

        for(int i = 1; i < list.size();i++){

            if(list.get(i-1) >= list.get(i)){
                rt = false;
                break;
            }

                    }
                    return rt;
    }

    public void inorder(TreeNode root,ArrayList<Integer> list){
        if(root !=null)
        {
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);      
        }
    }
}
