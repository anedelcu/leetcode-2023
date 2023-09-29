class Solution {

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int islands = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    markVisisted(i, j, grid);
                }
            }
        }
        return islands;
    }

    private void markVisisted(int i, int j, char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        markVisisted(i + 1, j, grid);
        markVisisted(i, j + 1, grid);
        markVisisted(i - 1, j, grid);
        markVisisted(i, j - 1, grid);
    }
}
