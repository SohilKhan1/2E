package Lecture29;

import java.util.Scanner;


public class DiameterOpt {
	Scanner sc = new Scanner (System.in);
	public class Node {
		int data;
		Node left;
		Node right;

		public Node() {
		}

		public Node(int data) {
			this.data = data;
		}
	}

	private Node root;

	public DiameterOpt() {
		root = CreatTree(root);

	}

	private Node CreatTree(Node root) {
		// TODO Auto-generated method stub
		int data = sc.nextInt();
		Node nn = new Node(data);

		boolean hlc = sc.nextBoolean();

		if (hlc) {
			nn.left = CreatTree(nn);
		}
		boolean hrc = sc.nextBoolean();

		if (hrc) {
			nn.right = CreatTree(nn);
		}

		return nn;
	}
	
	
	public class pair{
		int d=0;
		int h=-1;
	}
	

	public int diameter() {
		return diameter(this.root).d;
	}
	private pair diameter(Node root) {
		if (root == null)
			return new pair();

		pair lp = diameter(root.left);
		pair rp = diameter(root.right);
		pair sdp= new pair();
		int sd=lp.h+rp.h+2;
		sdp.d=Math.max(sd, Math.max(lp.d, rp.d));
		sdp.h=Math.max(lp.h, rp.h)+1;
		
		return  sdp;
	}

}
