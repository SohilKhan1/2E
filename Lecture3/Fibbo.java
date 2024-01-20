package Lecture3;

public class Fibbo {

	public static void main(String[] args) {
		int n = 5;
		int k = print(n);
		System.out.println(k);

	}

	private static int print(int n) {
		if (n == 0 || n==1) {
			return n;
		}
		int a = print(n - 1);
		int b = print(n - 2);
		return a + b;
	}

}





