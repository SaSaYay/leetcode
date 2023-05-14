package Code59;

/**
 * @author sasayaya
 * @create 2022/3/9 20:16
 */
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res =new int[n][n];
        int mid = n/2;
        int loop = n/2;
        int offset = 1;
        int startX = 0;
        int startY = 0;
        int count = 1;
        while (loop>0){
            int i =startX;
            int j = startY;
//            第一行从左到右
            for(;j<n-offset+startY;j++){
                res[i][j]=count++;
            }
//            最右列从上到下
            for (;i < n-offset+startX;i++){
                res[i][j] = count++;
            }
//            最下行从右到左
            for (;j>startY;j--){
                res[i][j] = count++;
            }
//            最左列从下到上
            for (;i>startX;i--){
                res[i][j] = count++;
            }
            loop--;
            offset+=2;
            startX++;
            startY++;

        }
        if (n%2==1){
            res[mid][mid] = n*n;
        }
        return res;
    }
}
