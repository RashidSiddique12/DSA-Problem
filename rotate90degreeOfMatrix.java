
//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Matrix/problem/rotate-by-90-degree-1587115621

//User function Template for Java

class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    // first swap for transpose of matrix
    static int[][] swap(int matrix[][], int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
        return matrix;
    }
    // this swap2 is for change the row
    static int[][] swap2(int matrix[][], int i, int low, int high){
        int temp = matrix[low][i];
        matrix[low][i] = matrix[high][i];
        matrix[high][i] = temp;
        return matrix;
    }
    // for rotate 90 degree we need to first tranpose and then change row low to high
    
    static void rotateby90(int matrix[][], int n) 
    { 
        // code here
        // for transpose
        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix[0].length; j++){
                swap(matrix, i, j);
                
            }
         }
    for(int i=0; i<matrix.length; i++){
        int low =0, high=matrix.length - 1;
        while(low < high){
            swap2(matrix, i, low, high);
            
            high--;
            low++;
        }
    }
}
}



// public class rotate90degreeOfMatrix {
    
// }
