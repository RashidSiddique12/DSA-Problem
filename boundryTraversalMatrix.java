// https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Matrix/problem/boundary-traversal-of-matrix-1587115620


// public class boundryTraversalMatrix {
    
// }
class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here 
        ArrayList <Integer> arr = new ArrayList <Integer>();
        if( n==1){
            for(int i=0; i<m; i++){
                arr.add(matrix[0][i]);
           }
        }
        else if(m==1){
            for(int i=0; i<n; i++){
                arr.add(matrix[i][0]);
            }
        }
        else{
            for(int i=0; i<m; i++){
                arr.add(matrix[0][i]);
                
            }
            for(int i=1; i<n; i++){
                arr.add(matrix[i][m-1]);
            }
            for(int i = m-2; i>=0; i--){
                arr.add(matrix[n-1][i]);
            }
            for(int i=n-2; i>0; i--){
                arr.add(matrix[i][0]);
            }
        }
        return arr;
    }
}
