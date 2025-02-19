package Lecture6;

public class KthFromLast {
	private class Node {
		private	int data;
		private	Node next;
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
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		KthFromLast k= new KthFromLast();
		for(int i=1;i<=8;i++) {
			k.addLast(i*10);
		}
		k.display();
		
		int k1=5;
		Node head=k.head;
		Node a=head;
		Node b=head;
		while(k1!=0) {
			a=a.next;
			k1--;
		}
		while(a!=null) {
			a=a.next;
			b=b.next;
		}
		System.out.println(b.data);
		

	}
}