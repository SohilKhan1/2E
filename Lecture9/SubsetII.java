package Lecture9;

import java.util.*;

public class SubsetII {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2 };
		List<List<Integer>> ans = new ArrayList<>();
		print(arr, 0, new ArrayList<Integer>(), ans);
		System.out.println(ans);
	}

	private static void print(int[] arr, int lp, ArrayList<Integer> list, List<List<Integer>> ans) {

//		System.out.println(list);
		ans.add(new ArrayList<Integer>(list));

		for (int i = lp; i < arr.length; i++) {
//			if(i!=lp && arr[i]==arr[i-1])
//				continue;
			list.add(arr[i]);
			print(arr, i + 1, list, ans);
			while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
				i++;
			}
			list.remove(list.size() - 1); 

		}

	}

}
