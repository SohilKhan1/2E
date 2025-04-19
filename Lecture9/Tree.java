package Lecture28;

import java.util.Scanner;

public class Tree {

	Scanner sc = new Scanner(System.in);

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

	public Tree() {
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

	public void display() {
		display(this.root);
	}

	private void display(Node root) {

		if (root == null)
			return;

		String str = "";
		str = str + root.data;

		str = "<--" + str;
		if (root.left != null) {
			str = root.left.data + str;
		} else {
			str = "." + str;
		}

		str = str + "-->";
		if (root.right != null) {
			str = str + root.right.data;
		} else {
			str = str + ".";
		}

		System.out.println(str);
		display(root.left);
		display(root.right);

	}

	public int hight() {
		return hight(this.root);
	}

	private int hight(Node root) {
		if (root == null)
			return -1;

		int lh = hight(root.left);
		int rh = hight(root.right);

		return Math.max(lh, rh) + 1;
	}

	public int diameter() {
		return diameter(this.root);
	}

	private int diameter(Node root) {
		if (root == null)
			return -1;

		int ld = diameter(root.left);
		int rd = diameter(root.right);

		int slfd = hight(root.left) + hight(root.right) + 2;

		return Math.max(slfd, Math.max(rd, ld));
	}

	public int min() {
		return min(this.root);
	}

	private int min(Node root) {

		if (root == null) {
			return Integer.MAX_VALUE;
		}

		int slf = root.data;
		int lm = min(root.left);
		int rm = min(root.right);

		return Math.min(slf, Math.min(lm, rm));
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node root, int item) {
		if (root == null)
			return false;

		if (root.data == item)
			return true;

		boolean l = find(root.left, item);
		boolean r = find(root.right, item);

		return l || r;
	}

}

//10 true 20 true 30 false false false true 40 true 50 false false true 6 false false
