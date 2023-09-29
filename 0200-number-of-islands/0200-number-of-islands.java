class Solution {

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int islands = 0;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    islands++;
                    markVisisted(i, j, grid, visited);
                }
            }
        }
        return islands;
    }

    private void markVisisted(int i, int j, char[][] grid, boolean[][] visited) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0' || visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        markVisisted(i + 1, j, grid, visited);
        markVisisted(i, j + 1, grid, visited);
        markVisisted(i - 1, j, grid, visited);
        markVisisted(i, j - 1, grid, visited);
    }
}
