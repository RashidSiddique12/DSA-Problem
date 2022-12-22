
//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Matrix/problem/transpose-of-matrix-1587115621
//User function Template for Java

class Solution
{
    //Function to find transpose of a matrix.
    static int[][] swap(int matrix[][], int i, int j){
       
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
        return matrix;
    }
    
    static void transpose(int matrix[][], int n)
    {
        // code here
        for(int i=0; i<n; i++){
            for(int j= i+1; j<n; j++){
                swap(matrix, i, j);
            }
        }
        
        
        
    }
}



// public class tranposeOfMatrix {
    
// }
