//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Matrix/problem/exchange-matrix-columns-1587115620
class Solution
{
    //Function to exchange first column of a matrix with its last column.
    static void exchangeColumns(int matrix[][])
    {
        // code here 
        for(int i=0; i<matrix.length; i++)
        {
            
                  int temp = matrix[i][0];
                  matrix[i][0] = matrix[i][matrix[0].length - 1];
                  matrix[i][matrix[0].length - 1] = temp;
           
        }
    }
}