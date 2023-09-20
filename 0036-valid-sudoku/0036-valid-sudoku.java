class Solution {

    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                char c = board[i][j];
                if(c != '.') {
                    continue;
                }
                if(!isValid(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValidRow(char[][] board, int row, int col) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            char c = board[i][col];
            if (set.contains(c)) {
                return false;
            }
            if (c != '.') {
                set.add(c);
            }
        }
        return true;
    }

    private boolean isValidCol(char[][] board, int row, int col) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            char c = board[col][i];
            if (set.contains(c)) {
                return false;
            }
            if (c != '.') {
                set.add(c);
            }
        }
        return true;
    }

    private boolean isValidBox(char[][] board, int row, int col) {
        Set<Character> set = new HashSet<>();
        int localRow = row - row % 3;
        int localCol = col - col % 3;
        for (int i = localRow; i < localRow + 3; i++) {
            for (int j = localCol; j < localCol + 3; j++) {
                char c = board[i][j];
                if (set.contains(c)) {
                    return false;
                }
                if (c != '.') {
                    set.add(c);
                }
            }
        }
        return true;
    }
    private boolean isValid(char[][] board, int row, int col) {
        if(isValidBox(board, row, col) && isValidRow(board, row, col) && isValidCol(board, row, col)) {
            return true;
        }
        return false;
    }
}
