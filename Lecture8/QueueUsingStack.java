package Lecture25;

import Lecture24.Dynamic_Stack;

public class QueueUsingStack {
	Dynamic_Stack primary = new Dynamic_Stack();
	Dynamic_Stack secondry = new Dynamic_Stack();
	
	
	
	public boolean isEmpty() {
		return primary.isEmpty();
	}
	
	public int Size() {
		return primary.Size();
	}
	
	public void enqueue(int val) throws Exception {
		while(!primary.isEmpty()) {
			secondry.push(primary.pop());
		}
		primary.push(val);
		while(!secondry.isEmpty()) {
			primary.push(secondry.pop());
		}
	}
	
	public int dequeue() throws Exception {
		if(primary.isEmpty()) {
			throw new Exception ("Stack is Empty");
		}
		return primary.pop();
	}
	public void display() throws Exception {
		primary.Display();
	}
	

}
