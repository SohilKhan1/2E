package Lecture4;

public class PermutationofString {
public static void main(String[] args) {
	String s = "aba";
	print(s,"");
}

private static void print(String s, String ans) {
	if(s.length()==0) {
		System.out.println(ans);
		return;
	}
	for(int i=0;i<s.length();i++) {
		print(s.substring(0,i)+s.substring(i+1), ans+s.charAt(i));
	}
	
}
}
