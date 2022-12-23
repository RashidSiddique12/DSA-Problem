//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Matrix/problem/multiply-the-matrices-1587115620


class Solution
{
    //Function to multiply two matrices.
    static int[][] multiplyMatrix(int A[][], int B[][])
    {
        // code here
        int r1=A.length;
        int c1=A[0].length;
        int r2=B.length;
        int c2=B[0].length;
        int mul[][] = new int[r1][c2];
        if(c1 != r2){
            return new int[0][0];
        }
        
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<r2; k++){
                    mul[i][j] += A[i][k] * B[k][j];
                }
                
            }
            
        }
        return mul;
    }
}
