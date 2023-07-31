public class TransposeMatrix {

    public static int[][] transpose(int[][] matrix) {

        // if n = m , if this the case we can solve this in constant space if not we
        // have to used extra space (O)mxn
        int n = matrix.length;
        int m = matrix[0].length;
        if (n == m) {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < m; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            return matrix;

        }

        int mat[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[j][i] = matrix[i][j];
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int mat[][] = transpose(matrix);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
