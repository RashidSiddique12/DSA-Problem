//https://leetcode.com/problems/reshape-the-matrix/description/

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       
        int store[][] = new int[r][c];
        if(r*c != (mat.length * mat[0].length)) {return mat;}

        int r1=0,c1=0;

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                
                if(c1 >= c){ 
                    c1=0; 
                    r1++;
                    }
                store[r1][c1++]  = mat[i][j];


            }
        }
        return store;
        
    }
}