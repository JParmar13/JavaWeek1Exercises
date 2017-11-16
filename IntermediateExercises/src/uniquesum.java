public class uniquesum {
	
	public static void Main(String[] args) {
		
		System.out.println(uniqueSum(1,2,3));
		System.out.println(uniqueSum(3,3,3));
		System.out.println(uniqueSum(1,1,2));

	}
	
	public static int uniqueSum(int a, int b, int c) {
		if (a==b && b==c) 
			return 0;
			else if (a==c)
				return b + c;
			else if (a==b)
				return c + a;
			else if (b==c)
				return a + b;
			
		else return a + b + c;
		}
		
		
		
	}
	
	
