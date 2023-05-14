public class Q5_NQueen {

    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        int count = solveNQueens(board, n);
        System.out.println("Number of solutions: " + count);
    }

    public static int solveNQueens(int[][] board, int n) {
        int count = 0;
        count = placeQueens(board, n, 0, count);
        return count;
    }

    private static int placeQueens(int[][] board, int n, int col, int count) {
        if (col == n) {
            count++;
            return count;
        }
        for (int row = 0; row < n; row++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 1;
                count = placeQueens(board, n, col + 1, count);
                board[row][col] = 0;
            }
        }
        return count;
    }

    private static boolean isSafe(int[][] board, int row, int col, int n) {
        int i, j;
        for (i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}
