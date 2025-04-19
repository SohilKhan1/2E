package Lecture28;

public class TreeClient {
	public static void main(String[] args) {
		Tree bt= new Tree();
		bt.display();
		System.out.println(bt.min());
		System.out.println(bt.find(60));
		System.out.println(bt.hight());
		System.out.println(bt.diameter());
	}

}

//10 true 20 true 30 false false false true 40 true 50 false false true 60 true 70 false false false