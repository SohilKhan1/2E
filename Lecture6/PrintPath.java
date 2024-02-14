package Lecture6;

public class PrintPath {
	static int count;
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		System.out.println(print(arr, 0, 0, ""));
		System.out.println(count);
	}

	private static int print(int[][] arr, int row, int col, String ans) {
		if (row == arr.length - 1 && col == arr[0].length - 1) {
			System.out.println(ans);
			count++;
			return 1;
		}
		int a = 0;
		int b = 0;
		if (row < arr.length - 1)
			a = print(arr, row + 1, col, ans + "V");
		if (col < arr[0].length - 1)
			b = print(arr, row, col + 1, ans + "H");

		return a + b;

	}

}
