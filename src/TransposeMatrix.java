public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        transpose(matrix);
    }

        public static int[][] transpose(int[][] matrix) {

        int mat_size= matrix.length;
        int ele_size =matrix[0].length;
        int[][] temp = new int[ele_size][mat_size];
        for(int i =0; i < mat_size; i++){
                for(int j =0; j < ele_size;j++) {
                    temp[j][i] = matrix[i][j];
                }
            }
            return temp;
        }
}
