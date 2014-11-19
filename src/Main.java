import java.util.Hashtable;



public class Main {
	
	public static boolean unique(String testString) {
		Hashtable<Character, Character> uniqueChar = new Hashtable<Character, Character>();
		boolean unique = true;
		for(int i=0; i<testString.length(); i++) {
			// If char has not appeared in string, add char value to hash
			char current = testString.charAt(i);
			if(!uniqueChar.containsKey(current)) {
//				boolean val = uniqueChar.containsValue(current);
//				boolean key = uniqueChar.containsKey(current);
				uniqueChar.put(current, current);
			}
			else {
				unique = false;
				break;
			}
		}
		return unique;
	}
	
	public static boolean uniqueNoBuffer(String testString) {
		// For each point in the string, examine each of the other chars in string to check if there is a duplicate
		for(int i=0; i<testString.length(); i++) {
			for(int j=i+1; j<testString.length(); j++) {
				if(testString.charAt(i) == testString.charAt(j))
					return false;
			}
		}
		return true;
	}
	
	public static char[] replaceSpaces(char[] testString) {
		// Search our char array for spaces
		for(int i=0; i<testString.length; i++) {
			if(testString[i] == ' ') {
				// If space is found, replace single space character with "%20"
				// This means we need to shift all other items after the space in string to the right by 2 spaces
				testString[i] = '%';
				shiftRight(testString, ++i);
				testString[i] = '2';
				shiftRight(testString, ++i);
				testString[i] = '0';
			}
		}
		return testString;
	}
	
	public static char[] shiftRight(char[] testString, int shiftIndex) {
		// All values in testString array from the shiftIndex need to shift right by one index
		// Start shifting from end of array to prevent loss of data points, and stop after we have shifted the point at shiftIndex
		// We don't shift the value at the end of array as it will go outside of array; it was assumed that string has sufficient
		// space at end of string to hold desired characters.
		for(int i=testString.length-1; i>shiftIndex; i--) {
			testString[i] = testString[i-1];
		}
		return testString;
	}
	
	public static void main(String[] args) {
		String myString = "Mr John Smith";
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
		
		if(uniqueNoBuffer(myString))
			System.out.println("String contains all unique characters.");
		else
			System.out.println("String does not contain all unique characters");
		
		System.out.println("Modified string is: ");
		System.out.print(replaceSpaces(myChar));
				
		return;
	}
}
