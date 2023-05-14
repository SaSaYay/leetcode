package Code199;


import java.util.ArrayList;
import java.util.List;



class Solution {
    List<Integer> res ;
    public List<Integer> rightSideView(TreeNode root) {
        helper(root,0);
        return res;
    }

    private void helper(TreeNode root,int depth) {
        if (root==null){
            return;
        }
        if (depth == res.size()){
            res.add(root.val);
        }
        depth++;
        helper(root.right,depth+1);
        helper(root.left,depth+1);
    }
}