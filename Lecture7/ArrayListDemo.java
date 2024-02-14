package Lecture7;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(10);
		list.add(20);
		list.add(100);
		list.add(2000);
		int[] arr = { 1, 2, 3 };
		System.out.println(arr);
		System.out.println(list);
		System.out.println(list.size());
		list.remove(2);
		list.remove(1);
		System.out.println(list);
		System.out.println(list.contains(1000));
		System.out.println(list.size());

	}

}
