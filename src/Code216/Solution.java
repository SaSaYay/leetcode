package Code216;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
            helper(n,k,0,1);
            return res;
    }
    private void helper(int targetSum,int k, int sum,int startIndex){
        if (sum>targetSum){
            return;
        }
        if (path.size()==k){
            if (sum==targetSum){
                res.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = startIndex; i < 9-(k-path.size())+1; i++) {
            sum+=i;
            path.add(i);
            helper(targetSum,k,sum,i+1);
            path.removeLast();
            sum-=i;
        }
    }
}