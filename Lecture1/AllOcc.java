package Lecture1;

import java.util.Arrays;

public class AllOcc {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 2 };
		int target = 2;
		int ans []=find(arr, target, 0, 0);
		System.out.println(Arrays.toString(ans));
	}

	private static int [] find(int[] arr, int target, int idx, int count) {

		if (idx == arr.length) {
			return new int[count];
		}

		if (arr[idx] == target) {
			count++;
		}

		int ans[] = find(arr, target, idx + 1, count);
		if(arr[idx]==target)
		ans[count - 1] = idx;
		return ans;

	}

}
