package Lecture26;

import java.util.Stack;

public class Histogram {
	public static void main(String[] args) {
		int[] arr = { 2, 1, 4, 5, 1, 3, 3 };
		System.out.println(largestarea(arr));
	}

	private static int largestarea(int[] arr) {
		// TODO Auto-generated method stub
		int ans = 0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int rm = i;
				int h = arr[st.pop()];
				if (st.isEmpty()) {
					ans = Math.max(ans, h * rm);
				} else {
					int lm = st.peek();
					ans = Math.max(ans, h * (rm - lm - 1));
				}
			}
			st.push(i);
		}

		int rm = arr.length;
		while (!st.isEmpty()) {
			int h = arr[st.pop()];
			if (st.isEmpty()) {
				ans = Math.max(ans, h * rm);
			} else {
				int lm = st.peek();
				ans = Math.max(ans, h * (rm - lm - 1));
			}
		}
		return ans;

	}

}
