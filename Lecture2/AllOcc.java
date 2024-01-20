package Lecture2;

import java.util.Arrays;

public class AllOcc {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 2 };
		int target = 2;
		int count = 0;
		int ans []=find(arr, target, 0, count);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] find(int[] arr, int target, int idx, int count) {
		if (idx == arr.length) {
			System.out.println(count);
			return new int[count];
		}
		if (arr[idx] == target) {
			count++;
		}
		int ans[] = find(arr, target, idx + 1, count);
		if (arr[idx] == target) {
			ans[count - 1] = idx;
		}
		return ans;
	}
}
