public class Task8 {
	
	public static void main(String[]args) {
		System.out.println(bunnyEars(2)); //return 4
		System.out.println(bunnyEars(6)); //return 12


	}
	
	public static int bunnyEars(int numOfBunnies) {
		if(numOfBunnies ==0)
		{
			return 0;
		}
		return 2 + bunnyEars(numOfBunnies -1);
	}
	}
