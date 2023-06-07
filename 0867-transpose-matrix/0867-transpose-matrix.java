class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] res = new int[columns][rows];
        for(int row = 0; row < rows; row++) {
            for(int col = 0; col < columns; col++) {
                res[col][row] = matrix[row][col];
            }
        }
        return res;
    }
}