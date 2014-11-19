package code.sample.work;

public class LinkedNode {
	private int key;
	private LinkedNode next;
	
	// Constructor
	public LinkedNode() {
		key = 0;
		next = null;
	}
	
	// Get key value
	public int getKey() {
		return this.key;
	}
	
	// Get next node
	public LinkedNode getNext() {
		return this.next;
	}
	
	// Set key value
	public void setKey(int newValue) {
		this.key = newValue;
		return;
	}
	
	// Set next node value
	public void setNext(LinkedNode node) {
		this.next = node;
		return;
	}
	
	public static LinkedNode enqueue(LinkedNode A, int key) {
		LinkedNode current = A;
		LinkedNode newNode = new LinkedNode();
		newNode.setKey(key);
		// Linked List was empty, so return with a single node containing the new node
		if(current == null || (current.getNext() == null && current.getKey() == 0)) {
			return newNode;
		}
		else {
			while(current.getNext() != null) {
				current = current.getNext();
			} 
			current.setNext(newNode);
		}
		return A;
	}
	
	public void walkList() {
		LinkedNode A = this;
		while(A != null) {
			System.out.println(A.getKey());
			A = A.getNext();
		}
		return;
	}
}
