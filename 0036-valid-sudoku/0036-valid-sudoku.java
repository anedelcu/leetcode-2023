class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        boolean[][] rows = new boolean[9][9];
        boolean[][] columns = new boolean[9][9];
        boolean[][] subBoxes = new boolean[9][9];
        
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                char digit = board[i][j];
                if(digit != '.') {
                    int num = digit - '1';
                    int subBoxIndex = (i / 3) * 3 + j / 3;
                    
                    if(rows[i][num] || columns[j][num] || subBoxes[subBoxIndex][num]) {
                        return false; // Duplicate digit found
                    }
                    
                    rows[i][num] = true;
                    columns[j][num] = true;
                    subBoxes[subBoxIndex][num] = true;
                }
            }
        }
        return true;
    }
}