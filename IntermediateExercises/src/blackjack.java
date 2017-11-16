
public class blackjack {
	
	public static void main(String[] args)
	{
		
		System.out.println(blackJGame(18, 21));
		System.out.println(blackJGame(20, 18));
		System.out.println(blackJGame(22, 22));		
			
	}
	
		public static int blackJGame(int a, int b) {
			if (a <= 21 && b <=21) {
				if (a > b) {
					return a;
				}
				else return b;
			}
			
			else return 0;
			
						
		}
	
		
	
}