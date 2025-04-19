package Lecture29;

import java.util.*;

public class Traversal {
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

	public Traversal() {
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

	public void preOurder() {
		preOurder(this.root);
	}

	private void preOurder(Node root) {

		if (root == null)
			return;

		System.out.print(root.data + " ");
		preOurder(root.left);
		preOurder(root.right);

	}

	public void inOurder() {
		inOurder(this.root);
	}

	private void inOurder(Node root) {

		if (root == null)
			return;

		inOurder(root.left);
		System.out.print(root.data + " ");
		inOurder(root.right);

	}

	public void postOurder() {
		postOurder(this.root);
	}

	private void postOurder(Node root) {

		if (root == null)
			return;

		postOurder(root.left);
		postOurder(root.right);
		System.out.print(root.data + " ");

	}

	public void levelOurder() {
		levelourder(this.root);
	}

	private void levelourder(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node k = q.remove();
			System.out.print(k.data+" ");
			if (k.left != null) {
				q.add(k.left);
			}
			if (k.right != null) {
				q.add(k.right);
			}
		}
	}

}
