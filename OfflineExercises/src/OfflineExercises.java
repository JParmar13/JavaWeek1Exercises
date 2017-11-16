public class OfflineExercises {
	
public static void main(String[]args) {
	
System.out.println(doubleChar("The"));
System.out.println(doubleChar("AAbb"));
System.out.println(doubleChar("Hi There"));

}
public static String doubleChar(String input) {
	String doubleThis = input;
	String tmpString = "";
	
		for (int i = 0; i < doubleThis.length(); i++) {
			tmpString += input.charAt(i);
			tmpString += input.charAt(i);
		
		}
		return tmpString;	
	}
						
}








// Task 1
//Given a string, return a string where for every char in the original, there are two chars.
//
//doubleChar("The") → "TThhee"
//doubleChar("AAbb") → "AAAAbbbb"
//doubleChar("HiThere") → "HHii--TThheerree"
