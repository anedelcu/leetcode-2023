class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] result = new int[r][c];
        int m = mat.length;
        int n = mat[0].length;
        
        int[] array = new int[m * n];
        int k = 0;
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                array[k++] = mat[i][j];
            }
        }
        k = 0;
        if( m * n != r * c) {
            return mat;
        }
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                result[i][j] = array[k++];
            }
        }
        return result;
        
    }
}