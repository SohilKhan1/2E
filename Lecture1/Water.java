package Lecture1;

public class Water {
	public static void main(String[] args) {
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		mostWaterBF(arr);
		mostWaterOpt(arr);

	}

	private static void mostWaterOpt(int[] arr) {
		int ans = 0;
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int width = end - start;
			int hight = Math.min(arr[start], arr[end]);
			int water = hight * width;
			ans = Math.max(ans, water);

			if (arr[start] < arr[end]) {
				start++;
			} else {
				end--;
			}
		}
		System.out.println(ans);

	}

	private static void mostWaterBF(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int width = j - i;
				int hight = Math.min(arr[i], arr[j]);
				int water = width * hight;
				ans = Math.max(ans, water);
			}
		}
		System.out.println(ans);

	}

}
