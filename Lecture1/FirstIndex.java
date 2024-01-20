package Lecture1;

public class FirstIndex {
	public static void main(String[] args) {
		int [] arr = {1,2,3,20};
		int target=20;
		int idx=0;
		System.out.println(find(arr,target,idx));
	}

	private static int find(int[] arr, int target, int idx) {
		if(idx==arr.length) {
			return -1;
		}
		if(arr[idx]==target){
			return idx;
		}
		return find(arr, target, idx+1);
		
	}

}
