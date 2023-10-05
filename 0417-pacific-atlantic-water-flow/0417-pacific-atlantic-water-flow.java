class Solution {

    int[][] dir = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        int m = heights.length;
        int n = heights[0].length;
        boolean[][] atlantic = new boolean[m][n];
        boolean[][] pacific = new boolean[m][n];
        for (int i = 0; i < n; i++) {
            dfs(heights, 0, i, pacific, Integer.MIN_VALUE);
            dfs(heights, m - 1, i, atlantic, Integer.MIN_VALUE);
        }
        for (int i = 0; i < m; i++) {
            dfs(heights, i, 0, pacific, Integer.MIN_VALUE);
            dfs(heights, i, n - 1, atlantic, Integer.MIN_VALUE);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (atlantic[i][j] && pacific[i][j]) {
                    
                    result.add(List.of(i, j));
                }
            }
        }
        return result;
    }

    private void dfs(int[][] heights, int i, int j, boolean[][] ocean, int prevHeight) {
        int m = ocean.length;
        int n = ocean[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }
        if (heights[i][j] < prevHeight || ocean[i][j]) {
            return;
        }
        ocean[i][j] = true;
        dfs(heights, i + 1, j, ocean, heights[i][j]);
        dfs(heights, i - 1, j, ocean, heights[i][j]);
        dfs(heights, i, j + 1, ocean, heights[i][j]);
        dfs(heights, i, j - 1, ocean, heights[i][j]);
    }
}
