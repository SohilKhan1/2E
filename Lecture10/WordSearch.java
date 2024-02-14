package Lecture10;

public class WordSearch {
	public static void main(String[] args) {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "SEEE";

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0)) {
					boolean flag = search(board, i, j, 0, word);
					if (flag) {
						System.out.println(true);
						return;
					}
				}
			}
		}
		System.out.println(false);
 }

	private static boolean search(char[][] board, int row, int col, int idx, String word) {
		if (idx == word.length()) {
			return true;
		}
		if (row < 0 || col < 0 || row == board.length || col == board[0].length
				|| board[row][col] != word.charAt(idx)) {
			return false;
		}
		int[] r = { 1, 0, -1, 0 };
		int[] c = { 0, 1, 0, -1 };
		boolean flag = false;
		char ch = board[row][col];
		board[row][col] = '*';
		for (int i = 0; i < c.length; i++) {
			flag = search(board, row + r[i], col + c[i], idx + 1, word);
			if (flag) {
				return flag;
			}
		}
		board[row][col] = ch;
		return flag;
	}

}
