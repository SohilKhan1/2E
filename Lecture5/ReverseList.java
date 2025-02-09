package Lecture5;

public class ReverseList {
	private static class Node {
		private int data;
		private Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	public void addLast(int item) {
		Node nn = new Node();
		nn.data = item;
		if (size == 0) {
			addFirst(item);
		} else {
			tail.next = nn;
			nn.next = null;
			size++;
			tail = nn;
		}
	}

	public Node reverseList() {
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head=prev;
		return prev;
	}

	public void reverseList_Recursion() {
		reverseListR(this.head, null);
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
	}

	private void reverseListR(Node Curr, Node Prev) {
		if (Curr == null) {
			return;
		}
		reverseListR(Curr.next, Curr);
		Curr.next = Prev;

	}

	public void Display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public static void main(String[] args) {
		ReverseList ll = new ReverseList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.Display();
		ll.reverseList();
		ll.Display();

	}

}