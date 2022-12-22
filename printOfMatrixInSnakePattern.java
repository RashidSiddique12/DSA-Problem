//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Matrix/problem/print-matrix-in-snake-pattern-1587115621

//User function Template for Java

class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here 
       
       ArrayList<Integer> arr = new ArrayList<Integer>(); // for adding element
       
            for(int i=0; i<matrix.length; i++){
                
            if(i%2==0){
                for(int j=0; j<matrix[0].length; j++){
                // System.out.print(matrix[i][j] + " ");
                arr.add(matrix[i][j]);
                
            }
            }
            else{
                 for(int j=matrix[0].length -1 ; j>=0; j--){
                // System.out.print(matrix[i][j] + " ");
                 arr.add(matrix[i][j]);
                
            }
            
        }
        
     
    }
    return arr;
}
}







// public class printOfMatrixInSnakePattern {
    
// }
