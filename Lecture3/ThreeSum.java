package Lecture3;

public class ThreeSum {
//	class Solution {
//	    public List<List<Integer>> threeSum(int[] arr) {
//	    Arrays.sort(arr);
//	     List<List<Integer>> list = new ArrayList<>();
//
//			for (int i = 0; i < arr.length - 2; i++) {
//
//				if (i == 0 || arr[i] != arr[i - 1]) {
//
//					int sum = -arr[i];
//					int lo = i + 1;
//					int hi = arr.length - 1;
//
//					while (lo < hi) {
//
//						if (arr[lo] + arr[hi] == sum) {
//							list.add(Arrays.asList(arr[i], arr[lo], arr[hi]));
//
//							while (lo < hi && arr[lo] == arr[lo + 1])
//								lo++;
//
//							while (lo < hi && arr[hi] == arr[hi - 1])
//								hi--;
//
//							lo++;
//							hi--;
//						} else if (arr[lo] + arr[hi] < sum) {
//							lo++;
//						} else {
//							hi--;
//						}
//					}
//
//				}
//
//			}
//	        System.out.println(list);
//			return list;   
//	    }
//	}
}
