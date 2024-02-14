package Lecture7;

public class Queen2 {
	public static void main(String[] args) {
		int tq = 2;
		int board[] = new int[4];
		print(board, tq, 1, "",0);
	}

	private static void print(int[] board, int tq, int qp, String ans,int idx) {
		if (qp > tq) {
			System.out.println(ans);
			return;
		}

		for (int i = idx; i < board.length; i++) {
			if (board[i] == 0) {
				board[i] = 1;
				print(board, tq, qp + 1, ans + "B" + i + "Q" + qp,i+1);
				board[i] = 0;
			}

		}

	}

}
