public class WordSearchIn2D {

    public static boolean helper(char[][] board, String word, int i, int j, int k) {

        if (k == word.length())
            return true;
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == '.'
                || word.charAt(k) != board[i][j])
            return false;

        board[i][j] = '.';
        int x[] = { -1, 1, 0, 0 };
        int y[] = { 0, 0, -1, 1 };
        // for all 8 direction
        // int x[] = { -1, 1, 0, 0, -1, -1, 1, 1 };
        // int y[] = { 0, 0, -1, 1, -1, 1, -1, 1 };
        boolean temp = false;
        for (int idx = 0; idx < 4; idx++) {
            temp = temp || helper(board, word, i + x[idx], j + y[idx], k + 1);
        }
        board[i][j] = word.charAt(k);
        return temp;
    }

    public static boolean search(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0) && helper(board, word, i, j, 0) == true) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String word = "SEE";
        boolean res = search(board, word);
        System.out.println(res);
    }
}
