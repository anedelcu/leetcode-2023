class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        int direction = 0; // o - right, 1 - down, 2 - left, 3 - up
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        List<Integer> result = new ArrayList<>();
        // int size = matrix.length
        while (left <= right && top <= bottom) {
            // right
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
                direction++;
            }
            // down
            else if (direction == 1) {
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
                direction++;
                // left
            } else if (direction == 2) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
                direction++;
            }
            // up
            else {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
                direction++;
            }
            direction = direction % 4;
        }
        return result;
    }
}
