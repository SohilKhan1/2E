package Lecture25;

import Lecture24.DynamicQueue;

public class StackUsingQueue {
	
	DynamicQueue primary= new DynamicQueue();
	DynamicQueue secondry= new DynamicQueue();
	
	
	public boolean isEmpty() {
		return primary.isEmpty();
	}
	
	public int Size() {
		return primary.Size();
	}
	
	public void push(int val) throws Exception {
		while(!primary.isEmpty()) {
			secondry.Enqueue(primary.Dequeue());
		}
		primary.Enqueue(val);
		while(!secondry.isEmpty()) {
			primary.Enqueue(secondry.Dequeue());
		}
	}
	
	public int pop() throws Exception {
		if(primary.isEmpty()) {
			throw new Exception ("Stack is Empty");
		}
		return primary.Dequeue();
	}
	public void display() {
		primary.Display();
	}
	
	

}
