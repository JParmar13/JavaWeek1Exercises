public class Task4 {
	
	public static void main (String[]args) {
		
	System.out.println(nTwice("Hello", 2));
	System.out.println(nTwice("Chocolate", 3));
	System.out.println(nTwice("Chocolate", 1));
	}
	
	public static String nTwice(String inputWord, int nChar) {
		
		String subStr1 = inputWord.substring(0, nChar);
		String subStr2 = inputWord.substring(inputWord.length() - nChar);
		
		return subStr1 += subStr2;
	}
	
	
	
	
	
}

	//Task 4
	//Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
	//nTwice("Hello", 2) → "Helo"
	//nTwice("Chocolate", 3) → "Choate"
	//nTwice("Chocolate", 1) → "Ce"
