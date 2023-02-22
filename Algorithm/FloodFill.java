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

//     class pair{
//         int x;
//         int y;
//         // int col;
//         pair(int xc,int yc){
//             x = xc ;
//             y = yc;
//             // col = c;
//         }
//     }
//     public int[][] floodFill(int[][] grid, int sr, int sc, int color) {

//         Queue<pair> q = new ArrayDeque<>();
//         boolean visited[][] = new boolean[grid.length][grid[0].length];
//         q.add(new pair(sr,sc));
//         visited[sr][sc] = true;
//         int currCol = grid[sr][sc];
//         grid[sr][sc] = color;
        

//         while(!q.isEmpty()){
//             pair curr = q.poll();
            
//             int x = curr.x;
//             int y = curr.y;
//             if(x-1>=0 && x-1 <grid.length && y>=0 && y < grid[0].length &&
//              currCol == grid[x-1][y] && visited[x-1][y] == false){
//                  visited[x-1][y] = true;
//                  q.add(new pair(x-1,y));
//                  grid[x-1][y] = color;
//             }
//             if(x+1>=0 && x+1 <grid.length && y>=0 && y < grid[0].length&&
//              currCol == grid[x+1][y] && visited[x+1][y] == false){
//                  visited[x+1][y] = true;
//                  q.add(new pair(x+1,y ));
//                  grid[x+1][y] = color;
//             }

//             if(x>=0 && x <grid.length && y-1>=0 && y-1 < grid[0].length&&
//              currCol == grid[x][y-1] && visited[x][y-1] == false){
//                  visited[x][y-1] = true;
//                  q.add(new pair(x,y-1 ));
//                  grid[x][y-1] = color;
//              }
//              if(x>=0 && x <grid.length && y+1>=0 && y+1 < grid[0].length&&
//              currCol == grid[x][y+1] && visited[x][y+1] == false){
//                  visited[x][y+1] = true;
//                  q.add(new pair(x,y+1 ));
//                  grid[x][y+1] = color;
//              }
//         }
//         return grid;
//     }
// }


/////


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