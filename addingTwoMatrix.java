//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Matrix/problem/adding-two-matrices3512



class Solution
{
    //Function to add two matrices.
    static int[][] sumMatrix(int A[][], int B[][])
    {
       // code here
       int C[][] = new int[A.length][A[0].length];
      if(A.length == B.length && A[0].length == B[0].length){
          
           for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                C[i][j] = A[i][j] + B[i][j];
               
           }
       }
       return C;
      }
      
      else{
        
          int D[][] = new int[0][0];
          return D;
      }
      
    }
}