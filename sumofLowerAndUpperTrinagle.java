//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Matrix/problem/sum-of-upper-and-lower-triangles-1587115621

class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        ArrayList<Integer> store = new ArrayList<Integer>();
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                
                sum1 = sum1 + matrix[i][j];
            }
            
            for(int j=0; j<=i; j++){
                sum2 = sum2 + matrix[i][j];
            }
        }
        
        
        
        store.add(sum1);
        store.add(sum2);
        
        return store;
        
        
    }
}