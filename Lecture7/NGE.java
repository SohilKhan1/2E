package Lecture25;

import java.util.*;

public class NGE {
	public static void main(String[] args) {
		int arr[] = { 12, 8, 4, 9, 13, 17, 15, 14, 21, 3, 2 };
		int ans[] = new int[arr.length];

		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {

			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				ans[st.pop()] = arr[i];
			}

			st.push(i);
		}
		
		while(!st.isEmpty()) {
			ans[st.pop()]=-1;
		}
		
		System.out.println(Arrays.toString(ans));

	}

}
