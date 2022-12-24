//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Matrix/problem/search-in-a-matrix-1587115621
class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    // code here 
	    boolean flag = true;
	    int i=0, j=m-1;
	    while(i < n && j>=0){
	        if(matrix[i][j] == x) return flag;
	        else if(matrix[i][j] > x) j--;
	        else i++;
	    }
	    return !flag;
	} 
} 
