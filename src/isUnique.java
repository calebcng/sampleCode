import java.util.Hashtable;


public class isUnique {
	private Hashtable<String, Character> uniqueChar = new Hashtable<String, Character>();
	
	public boolean unique(String testString) {
		boolean unique = true;
		for(int i=0; i<testString.length(); i++) {
			// If char has not appeared in string, add char value to hash
			if(!uniqueChar.containsValue(testString.charAt(i))) {
				uniqueChar.put("i", testString.charAt(i));
			}
			else {
				unique = false;
				break;
			}
		}
		return unique;
	}
}
