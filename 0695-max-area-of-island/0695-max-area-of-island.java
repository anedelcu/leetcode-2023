class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxArea = 0;
        for(int i = 0; i <m; i++ ) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    int area = calculateArea(i, j, grid);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
        
    }
    
    private int calculateArea(int i, int j, int[][] grid) {
        int area = 0;
        int m = grid.length;
        int n = grid[0].length;
        if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        area = 1 + calculateArea(i + 1, j, grid)
                 + calculateArea(i - 1, j, grid)
                 + calculateArea(i, j + 1, grid)
                 + calculateArea(i, j - 1, grid);
        return area;
    }
}