class Solution {
    public int[][] generateMatrix(int n) {
        int[][]  matrix = new int[n][n];
        int direction = 1; // 1 -right, 2- down, 3-left, 4- up
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int val = 1;
        while(left <= right && top <= bottom) {
            if(direction == 1) {
                for(int i = left; i <= right; i++) {
                    matrix[top][i] = val;
                    val++;
                }
                top++;
            }
            else if(direction == 2) {
                for(int i = top; i <= bottom; i++) {
                    matrix[i][right] = val;
                    val++;
                }
                right--;
            }
            else if(direction == 3) {
                for(int i = right; i >=left; i--) {
                    matrix[bottom][i] = val;
                    val++;
                }
                bottom--;
            }
            else {
                for(int i = bottom; i >= top; i--) {
                    matrix[i][left] = val;
                    val++;
                }
                left++;
            }
            direction = ( 1 + direction) % 4;
            
        }
        return matrix;
        
    }
}