package Lecture8;

import java.util.*;

public class CombinationSum__II {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 2, 5 };
		int target = 5;
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		print(arr, target, list, ans, 0);
		System.out.println(ans);

	}

	private static void print(int[] arr, int target, List<Integer> list, List<List<Integer>> ans, int idx) {
		if (target == 0) {
			System.out.println(list);
			List<Integer> ll = new ArrayList<Integer>(list);
			ans.add(ll);
			// ans.add(new ArrayList<Integer>(list));
			return;
		}
		for (int i = idx; i < arr.length; i++) {

			if (i != idx && arr[i] == arr[i - 1]) {
				continue;
			}

			if (target >= arr[i]) {
				list.add(arr[i]);
				target = target - arr[i];
				print(arr, target, list, ans, i + 1);
				target = target + arr[i];
				list.remove(list.size() - 1);
			}

		}

	}
}
