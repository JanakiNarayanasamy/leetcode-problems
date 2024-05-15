package mediumProblems;

public class PathWithMaximumGold {
    public static void main(String[] args) {
        int[][] grid = {{1,0,7},{2,0,6},{3,4,5},{0,3,0},{9,0,20}};
        System.out.println(getMaximumGold(grid));
    }
    static int res, sum;

    public static int getMaximumGold(int[][] grid){

        res =0; sum =0;

        if (grid == null || grid.length ==0 ) return res;

        int m = grid.length;
        int n = grid[0].length;
        for (int i=0; i< m; i++){
            for (int j=0; j< n; j++){
                dfs(grid,i, j, 0);
            }
        }
        return res;
    }

    public static void dfs(int[][] grid, int row, int col, int sum){

        if(row < 0 || row > grid.length -1 || col < 0 || col > grid[0].length -1
        || grid[row][col] == 0){
            res = Math.max(res , sum);
            return;
        }

        int val = grid[row][col];
        grid[row][col] = 0;
        dfs(grid, row +1, col, sum+val);
        dfs(grid, row -1, col, sum+val);
        dfs(grid, row , col+1, sum+val);
        dfs(grid, row , col-1, sum+val);
        grid[row][col] = val;


    }

}
