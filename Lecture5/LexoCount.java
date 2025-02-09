package Lecture5;

public class LexoCount {
	public static void main(String[] args) {
		int N = 50;
		lexo(0, N);

	}

	private static void lexo(int ans, int N) {

		if (ans > N) {
			return;
		}

		System.out.println(ans);

		int i = 0;
		if (ans == 0) {
			i = 1;
		}

		for (; i <= 9; i++) {
			lexo(ans * 10 + i, N);
		}

	}

}