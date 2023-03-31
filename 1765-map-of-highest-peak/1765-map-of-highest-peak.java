class Solution {

    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        int[][] isLand = new int[m][n];
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    isLand[i][j] = 0;
                    q.add(new int[] { i, j });
                } else {
                    isLand[i][j] = -1;
                }
            }
        }
        int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            for (int[] direction : directions) {
                int r = cell[0] + direction[0];
                int c = cell[1] + direction[1];
                if (r >= 0 && r < m && c >= 0 && c < n && isLand[r][c] == -1) {
                    isLand[r][c] = isLand[cell[0]][cell[1]] + 1;
                    q.add(new int[] { r, c });
                }
            }
        }
        return isLand;
    }
}
