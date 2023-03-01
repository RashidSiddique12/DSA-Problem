//https://leetcode.com/problems/spiral-matrix/description/

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int R = matrix.length;
        int C = matrix[0].length;
        int top = 0, left=0, right= C-1, bottom = R-1;
        while(top <= bottom && left <= right){
            for(int i=top; i<= right; i++)
                list.add(matrix[top][i]);
            top++;

            for(int i=top; i<=bottom; i++)
                list.add(matrix[i][right]);
            right--;
            if(top <= bottom){
                for(int i=right; i>=left; i--)
                    list.add(matrix[bottom][i]);
                bottom--;
            }
            if(left <= right){
                for(int i=bottom; i>=top; i--)
                    list.add(matrix[i][left]);
                left++;
            }
        }

        return list;
        
    }
}