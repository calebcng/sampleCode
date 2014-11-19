package code.sample.work;
import code.sample.work.LinkedNode;

public class linkedLists {
	public static LinkedNode add(LinkedNode A, LinkedNode B) {
		LinkedNode sum = null;
		LinkedNode current = null;
		int carry = 0;
		
		// Add each item in both linked lists until the end of one (or both) lists has been reached
		while(A != null && B != null) {
			// If linked list for sum has not been initialized yet, initialize and set initial value
			if (sum == null) {
				sum = new LinkedNode();
				sum.setKey(A.getKey()+B.getKey());
				current = sum;
				carry = sum.getKey()%10;
				A = A.getNext();
				B = B.getNext();
			}
			// Otherwise, save sum in a new key and set the next pointer for the current node equal to the new node
			else {
				LinkedNode tempNode = new LinkedNode();
				tempNode.setKey(A.getKey() + B.getKey() + carry);
				carry = tempNode.getKey()%10;
				current.setNext(tempNode);
				current = current.getNext();
				A = A.getNext();
				B = B.getNext();
			}
		}
		
		return sum;
	}
}
