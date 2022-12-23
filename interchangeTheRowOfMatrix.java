//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Matrix/problem/reversing-the-rows-of-a-matrix-1587115621

class Solution
{
    //Function to interchange the rows of a matrix.
    static void interchangeRows(int matrix[][])
    {
        // code here 
        int r= matrix.length;
        int c= matrix[0].length;
        int top = 0, bottom = r-1;
        while(top < bottom){
            for(int i=0; i<c; i++){
                int temp = matrix[top][i];
                matrix[top][i] = matrix[bottom][i];
                matrix[bottom][i] = temp;
            }
            top++;
            bottom--;
            
        }
        
        
      
        
    }
}