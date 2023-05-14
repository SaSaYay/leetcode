package Code337;

import javax.swing.tree.TreeNode;


class Solution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int rob(TreeNode root) {
        int[] helper = helper(root);
        return Math.max(helper[0],helper[1]);
    }

    private int[] helper(TreeNode root) {//做不偷右偷
//        终止条件
        if (root==null){
            return new int[2];
        }
//        左右
        int[] left = helper(root.left);
        int[] right = helper(root.right);
//        当前
//        2.偷这个节点
        int val2 = root.val+left[0]+right[0];
//        1.不
        int val1 = Math.max(left[0],left[1])+Math.max(right[0],right[1]);

        return new int[]{val1,val2};

    }

}
