package easyProblems;

public class Convert1Dto2DArray {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int m = 1 , n=1;
        construct2DArray(arr, m, n);
    }
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] res = new int[m][n];
        if(original.length != m*n){
            return new int[0][];
        }
        else {
            int x =0;
            int y =0;
            for (int i =0; i < original.length;){
               while (x < m){
                   while (y < n){
                       res[x][y] = original[i];
                       y++;
                       i++;
                   }
                   y =0;
                   x++;
               }
            }
        }
        for (int i =0; i < res.length; i++){
            for (int j =0; j <res[i].length; j++){
                System.out.println(res[i][j]);
            }
        }

        return res;
    }
}
