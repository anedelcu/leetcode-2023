class Solution {

    public int islandPerimeter(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    return dfs(i, j, grid, visited);
                }
            }
        }
        return -1;
    }

    private int dfs(int i, int j, int[][] grid, boolean[][] visited) {
        int perim = 0;
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 1;
        }
        if (visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        perim += dfs(i, j + 1, grid, visited);
        perim += dfs(i + 1, j, grid, visited);
        perim += dfs(i, j - 1, grid, visited);
        perim += dfs(i - 1, j, grid, visited);

        return perim;
    }
}
