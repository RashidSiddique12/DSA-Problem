class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int r = grid.length;
        int c = grid[0].length;
        for(int i=r - 1; i>=0; i--){
            for(int j= c - 1; j>=0; j--){
                if(grid[i][j] < 0){
                    count++;
                }else{
                    break;
                }
            }
            
        }
        return count;
        
    }
}