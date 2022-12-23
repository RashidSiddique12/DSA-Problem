//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Matrix/problem/spirally-traversing-a-matrix-1587115621
class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> store = new ArrayList<Integer>();
        
        int top=0, left=0, right= c-1, bottom = r-1;
        while(top <= bottom && left <= right){
            for(int i=left; i<=right; i++) 
                store.add(matrix[top][i]);
            top++;
            for(int i=top; i<=bottom; i++)
                store.add(matrix[i][right]);
            right--;
            if(top <= bottom){
                for(int i= right; i>= left; i--)
                    store.add(matrix[bottom][i]);
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i>= top; i--){
                    store.add(matrix[i][left]);
                }
                left++;
            }
                
        }
        return store;
    }
}
