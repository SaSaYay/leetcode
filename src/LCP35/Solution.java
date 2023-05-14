package LCP35;

class Solution {

    int[][] path;
    int[] cost;
    int enD;
    int max;
    int min = Integer.MAX_VALUE;

    public int electricCarPlan(int[][] paths, int cnt, int start, int end, int[] charge) {

        int[] used = new int[charge.length];
        path = paths;
        cost = charge;
        enD = end;
        max = cnt;
        dfs(0,start,0,used);
        return min;
    }
    private void dfs(int energy, int cur,int res,int[] used) {
        if (cur == enD){
            min = Math.min(res,min);
            return;
        }
//        最多可以充多少电
        int maxCharge = max-energy;
        for (int i = 0; i < path.length; i++) {
//         确定目的地
            if (path[i][0] == cur &&used[path[i][1]]!=1 ){
                // 充不等的电之后走
                used[cur] = 1;
                for (int j = 0; j <=maxCharge; j++) {

                    if (energy+j<path[i][2] ){
                        continue;
                    }
                    dfs(energy + j - path[i][2],path[i][1],res+j*cost[cur]+path[i][2],used);
                }
                used[cur] = 0;
            }
            if (path[i][1] == cur && used[path[i][0]]!=1 ){
                // 充不等的电之后走
                used[cur] = 1;
                for (int j = 0; j <=maxCharge; j++) {
                    if (energy+j<path[i][2] ){
                        continue;
                    }
                    dfs(energy + j - path[i][2],path[i][0],res+j*cost[cur]+path[i][2],used);
                }
                used[cur] = 0;
            }
        }
    }
}