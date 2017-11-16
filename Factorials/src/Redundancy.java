import java.util.ArrayList;

public class Redundancy {

	public static void main(String[]args) {
		compressor("start art this is a test");
		
	}
	
	public static void compressor(String inputPhrase) {
		String[] words = inputPhrase.split(" ");
		String outputString = "";
		for(int i = 0; i < words.length - 1; i++) {
			for(int j = 0; j < words[i].length(); j++) {
				String tempSubstring = words[i].substring(j, words[i].length());
				if(words[i + 1].indexOf(tempSubstring) == 0) {
					outputString += words[i].substring(0, j) + words[i + 1] + " ";
					break;
				} else if(j == words[i].length() - 1) {
					outputString += words[i] + " ";
				}
			}
		}
		System.out.println(outputString);
	}
}
