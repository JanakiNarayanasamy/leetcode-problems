package easyProblems;

public class CellWithOddValuesInMatrix {
    public static void main(String[] args) {
      int m = 2, n = 3;
      int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        int count = 0;
        for (int[] num : indices){
            row[num[0]]++;
            col[num[1]]++;
        }
        for (int i=0; i< m;i++){
            for (int j=0; j < n; j++){
                if((row[i]+col[j])%2 !=0){
                    count++;
                }
            }
        }
        return count;
    }

}

