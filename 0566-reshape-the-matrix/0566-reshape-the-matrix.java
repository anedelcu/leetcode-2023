class Solution {

    public int[][] matrixReshape(final int[][] mat, final int r, final int c) {
        int m = mat.length;
        int n = mat[0].length;
        int length = m * n;

        if (r * c != length) {
            return mat;
        }

        int[][] reshaped = new int[r][c];
        for (int i = 0; i < length; i++) {
            reshaped[i / c][i % c] = mat[i / n][i % n];
        }
        return reshaped;
    }
}
