package Lecture7;

import java.util.*;

public class CombinationSum {

	public static void main(String[] args) {
		int[] arr = { 1,2,2 };
		int target = 5;
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		print(arr, target, list, ans);
		System.out.println(ans);

	}

	private static void print(int[] arr, int target, List<Integer> list, List<List<Integer>> ans) {

		if (target == 0) {
			System.out.println(list);
			ans.add(new ArrayList<Integer>(list));
			return;
		}
		if (target < 0) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
			print(arr, target - arr[i], list, ans);
			list.remove(list.size() - 1);
		}
	}
}
