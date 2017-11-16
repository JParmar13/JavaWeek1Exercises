public class Task2 {
	
	public static void main (String[]args) {
		
		System.out.println(getSandwich("breadjambread"));
		System.out.println(getSandwich("xxbreadjambreadyy"));
		System.out.println(getSandwich("xxbreadyy"));
		
	}
	
	public static String getSandwich(String input) {				//if input has two instances of bread, find the substring between the two instances													
																	//if one instance, return empty string, otherwise return the substring
		String givenBread = input;
				
		int firstBreadIndex = givenBread.indexOf("bread") + 5;
		int lastBreadIndex = givenBread.lastIndexOf("bread");
		
	    
		
		
		String inbetweenBread = givenBread.substring(firstBreadIndex, lastBreadIndex);
		return inbetweenBread;
		
				
				
		
	}
}






//A sandwich is two pieces of bread with something in between.
//Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
//
//getSandwich("breadjambread") → "jam"
//getSandwich("xxbreadjambreadyy") → "jam"
//getSandwich("xxbreadyy") → ""
