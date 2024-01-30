package Lecture5;

public class UniquePermutations {
	public static void main(String[] args) {
		String s = "aba";

		print(s, "");
	}

	private static void print(String s, String ans) {
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			
			boolean b = false;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					b=true;
					break;
				}
			}
			if(b==false)
			print(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
		}

	}
}
