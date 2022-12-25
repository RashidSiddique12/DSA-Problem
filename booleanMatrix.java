//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Matrix/problem/boolean-matrix-problem-1587115620

class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        // code here 
        ArrayList<Integer>I= new ArrayList<>();
        ArrayList<Integer>J=new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(matrix[i][j]==1){
                    I.add(i);
                    J.add(j);
                }
            }
        }
        for(int i : I){
            for(int j=0; j<c; j++){
                matrix[i][j]=1;
            }
        }
        for(int i : J){
            for(int j=0; j<r; j++){
                matrix[j][i] = 1;
            }
        }
    }
}
