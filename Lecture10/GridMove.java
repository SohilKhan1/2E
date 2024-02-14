package Lecture10;

public class GridMove {
	static int count = 0;

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		print(arr, 0, 0, "");
		System.out.println(count);
	}

	private static void print(int[][] arr, int row, int col, String ans) {

		if (row == 2 && col == 2) {
			//System.out.println(ans);
			count++;
			return;
		}
		if (row < 0 || col < 0 || row == arr.length || col == arr[0].length || arr[row][col] == 1) {
			return;
		}

		arr[row][col] = 1;

//		print(arr, row + 1, col, ans + "V");
//		print(arr, row, col + 1, ans + "H");
//		print(arr, row - 1, col, ans + "V");
//		print(arr, row, col - 1, ans + "H");

		int[] r = { 0, 1, 0, -1 };
		int[] c = { 1, 0, -1, 0 };
		for (int i = 0; i < 4; i++) {

			print(arr, row + r[i], col + c[i], ans);
		}

		arr[row][col] = 0;
	}

}
