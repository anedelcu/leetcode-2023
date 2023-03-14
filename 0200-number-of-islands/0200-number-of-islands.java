class Solution {
    public int numIslands(char[][] grid) {
        
        int numberOfIslands =  0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1'){
                    numberOfIslands += islands(grid, i, j);
                }
            }
        }
        
        return numberOfIslands;
    }
    
    public int islands(char[][] grid, int i, int j) {
        if( i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return 0;
        }
        grid[i][j] = '0';
        islands(grid, i + 1, j);
        islands(grid, i - 1, j);
        islands(grid, i, j + 1);
        islands(grid, i, j - 1);
        return 1;
    }

}