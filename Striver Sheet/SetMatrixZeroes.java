class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int row[] = new int[r];
        int col[] = new int[c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;

                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }

            }
        }

    }
}

// brute force app

// class Solution {
// public void markRow(int[][] matrix, int i){
// for(int j=0; j<matrix[0].length; j++){
// if(matrix[i][j] != 0){
// matrix[i][j] = -11;
// }
// }
// }

// public void markCol(int[][] matrix, int j){
// for(int i=0; i<matrix.length; i++){
// if(matrix[i][j] != 0){
// matrix[i][j] = -11;
// }
// }
// }

// public void setZeroes(int[][] matrix) {
// int r = matrix.length;
// int c = matrix[0].length;
// for(int i=0; i<r; i++){
// for(int j=0; j<c; j++){
// if(matrix[i][j] == 0){
// markRow(matrix, i);
// markCol(matrix, j);

// }
// }
// }

// for(int i=0; i<r; i++){
// for(int j=0; j<c; j++){
// if(matrix[i][j] == -11){
// matrix[i][j] = 0;
// }
// }
// }

// }
// }