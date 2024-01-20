package Lecture3;

public class ClimbStairs {
	static int a = 0;

	public static void main(String[] args) {
		int n = 4;
		int k = print(n, "");
		System.out.println(k);
		System.out.println(a);
	}

	private static int print(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			a++;
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		int a = print(n - 1, ans + 1);
		int b = print(n - 2, ans + 2);
		int c = print(n - 3, ans + 3);
		return a + b + c;
	}

}
