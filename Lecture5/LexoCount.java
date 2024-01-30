package Lecture5;

public class LexoCount {
	public static void main(String[] args) {
		int n = 15;
		print(n, 0);
	}

	private static void print(int n, int ans) {
		if (ans <= n) {
			System.out.println(ans);
		}
		if (ans > n)
			return;
		int i = 0;
		if (ans == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			print(n, ans * 10 + i);
		}

	}
}
