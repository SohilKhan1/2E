package Lecture4;

import java.util.Arrays;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String str = "abcabcdef";
		find1(str);
		find2(str);
	}

	private static void find2(String str) {

		int[] arr = new int[256];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[ch] = arr[ch] + 1;
		}

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (arr[ch] == 1) {
				System.out.println(ch + ":- Index " + i);
				break;
			}
		}

	}

	private static void find1(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(ch + ":- Count " + count);
				break;
			}
		}
	}
}
