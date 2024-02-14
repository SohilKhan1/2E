package Lecture7;

public class Queen1 {
	public static void main(String[] args) {
		int tq = 2;
		int board[] = new int[4];
		print(board, tq, 1, "");
	}

	private static void print(int[] board, int tq, int qp, String ans) {
		if (qp > tq) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < board.length; i++) {
			if (board[i] == 0) {
				board[i] = 1;
				print(board, tq, qp + 1, ans + "B" + i + "Q" + qp);
				board[i] = 0;
			}

		}

	}

}
