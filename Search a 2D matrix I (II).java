// https://leetcode.com/problems/search-a-2d-matrix-i/submissions/
// https://leetcode.com/problems/search-a-2d-matrix-ii/submissions/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean ans = false;
        
        int i = 0, j = matrix[0].length - 1;
        
        while(i >= 0 && i < matrix.length && j < matrix[0].length && j >= 0){
            
            if(matrix[i][j] == target){
                ans = true;
                return ans;
            }
            
            else if(matrix[i][j] > target){
                j--;
            }
            
            else{
                i++;
            }
            
        }
        return ans;
    }
}
