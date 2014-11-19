package code.sample.work;
import code.sample.work.arraysAndStrings;
import code.sample.work.*;

public class Main {
	
	public static void main(String[] args) {
		/*String myString = "abbccca";
		char[] myChar = new char[17];
		myChar[0] = 'M';
		myChar[1] = 'r';
		myChar[2] = ' ';
		myChar[3] = 'J';
		myChar[4] = 'o';
		myChar[5] = 'h';
		myChar[6] = 'n';
		myChar[7] = ' ';
		myChar[8] = 'S';
		myChar[9] = 'm';
		myChar[10] = 'i';
		myChar[11] = 't';
		myChar[12] = 'h';
		System.out.println("String is: " + myString);
		
		if(arraysAndStrings.uniqueNoBuffer(myString))
			System.out.println("String contains all unique characters.");
		else
			System.out.println("String does not contain all unique characters");
		
		System.out.println("Modified string is: ");
		System.out.println(arraysAndStrings.replaceSpaces(myChar));
		System.out.println("Compressed string is: " + arraysAndStrings.compress(myString));*/
		
		//Initialize test variables
		LinkedNode A = new LinkedNode();
		A = LinkedNode.enqueue(A, 7);
		A = LinkedNode.enqueue(A, 1);
		A = LinkedNode.enqueue(A, 6);
		A.walkList();
		LinkedNode B = new LinkedNode();
		B = LinkedNode.enqueue(B, 5);
		B = LinkedNode.enqueue(B, 9);
		B = LinkedNode.enqueue(B, 2);
		B.walkList();
		
		LinkedNode sum = linkedLists.add(A, B);
		sum.walkList();
		
		
				
		return;
	}
}
