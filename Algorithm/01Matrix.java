//https://leetcode.com/problems/01-matrix/description/?envType=study-plan&id=algorithm-i

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j] == 0){
                    q.add(new int[]{i,j}); 
                }
                else{
                    mat[i][j] = -1;
                }
            }
        }

        int [][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            int[] cell = q.poll();
            for(int[] d : dir){
                int r = cell[0] + d[0];
                int c = cell[1] + d[1];
                if( r < 0 || r >=n || c < 0 || c >= m || mat[r][c] != -1) continue;
                q.add(new int[] {r, c});
                mat[r][c] = mat[cell[0]][cell[1]] + 1;
            }
        }

        return mat;
        
    }
}