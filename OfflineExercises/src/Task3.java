public class Task3 {

	public static void main(String[] args) {

		// Given three ints, a b c, one of them is small, one is medium and one is
		// large.
		// Return true if the three values are evenly spaced, so the difference between
		// small and medium is the same as the difference between medium and large.

		// evenlySpaced(2, 4, 6) → true
		// evenlySpaced(4, 6, 2) → true
		// evenlySpaced(4, 6, 3) → false
		System.out.println(evenlySpaced(2, 4, 6));
		System.out.println(evenlySpaced(4, 6, 2));
		System.out.println(evenlySpaced(4, 6, 3));

	}

	public static boolean evenlySpaced(int a, int b, int c) {

		int smallestNumber = Integer.min(Integer.min(a, b), c);
		int largestNumber = Integer.max(Integer.max(a, b), c);
		int mediumNumber = 0;
		int numberArray[] = { a, b, c };

		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] == largestNumber || numberArray[i] == smallestNumber) {

			} else {
				mediumNumber = numberArray[i];
			}

			

		}
		if (mediumNumber - smallestNumber == largestNumber - mediumNumber)

			return true;

		else
			return false;

	}
}