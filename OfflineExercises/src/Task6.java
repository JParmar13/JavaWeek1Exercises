public class Task6 {
	
	public static void main(String[]args) {
		
//		Given a string, return recursively a "cleaned" string where adjacent chars 
//		that are the same have been reduced to a single char. So "yyzzza" yields "yza".
//		stringClean("yyzzza") → "yza"
//		stringClean("abbbcdd") → "abcd"
//		stringClean("Hello") → "Helo"
			
		System.out.println(stringClean("yyzzza"));
		
	}
//	private static String stringClean(String input) {
//		
//		String outputString = "";
//		
//		for (int i = 0; i < input.length(); i++) {
//			for (int j = 1; j < input.length(); j++) {
//			if (input.charAt(i) == input.charAt(j)) {
//				outputString += input.charAt(i);
//			}
//			else outputString += input.charAt(i);
//		}
//			
//		}
//		return outputString;		
	
	private static String stringClean(String input) {
		String outputString = "";
		for(int i = 0; i < input.length(); i++) {
			if (i + 1 == input.length() || input.charAt(i) != input.charAt(i + 1)) {
				outputString += input.charAt(i);
			}
			
			//outputString += input.charAt(input.length());			

		}
		return outputString;
	}
	/*
	 * Loop through string
	 * if current character is same as next character dont add to output string
	 * If not (else), add character and move on
	 * 
	 * */

}
		
		
		
		
	
	
	
