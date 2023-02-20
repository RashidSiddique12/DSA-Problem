//https://leetcode.com/problems/flood-fill/submissions/889562150/

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int iniColor = image[sr][sc];
        int [][]ans= image;
        int delRow[] = {-1,0,+1,0};
        int delCol[] = {0,+1,0,-1};

        dfs(sr,sc,ans,image,color, delRow, delCol, iniColor);

        return ans;
        
    }

    public void dfs(int row, int col, int[][] ans, int[][] image, int newColor, int[] delRow, int[] delCol, int iniColor){

        ans[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;

        for(int i=0; i<4; i++){
            int nrow =row + delRow[i];
            int ncol = col + delCol[i];
            if(nrow >= 0 && nrow<n && ncol >=0 && ncol < m && 
                image[nrow][ncol] == iniColor &&
                ans[nrow][ncol] != newColor)
                {
                    dfs(nrow,ncol,ans,image,newColor, delRow, delCol, iniColor);
                }
        }

    }
}


// class Solution {
//     public int[][] floodFill(int[][] image, int sr, int sc, int color) {
//         int oldColor = image[sr][sc];
//         if (oldColor == color) return image;

//         fill(image, sr, sc, color, oldColor);
//         return image;
//     }

//     public void fill(int[][] image, int row, int col, int newColor, int oldColor) {
//         if (row < 0 || row >= image.length || col < 0 || col >= image[0].length ||
//             image[row][col] != oldColor) return;

//         image[row][col] = newColor;
//         fill(image, row - 1, col, newColor, oldColor);
//         fill(image, row + 1, col, newColor, oldColor);
//         fill(image, row, col - 1, newColor, oldColor);
//         fill(image, row, col + 1, newColor, oldColor);
//     }
// }