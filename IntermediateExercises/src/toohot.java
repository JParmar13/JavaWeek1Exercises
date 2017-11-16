public class toohot {
	
	public static void Main(String[]args) {
		
		System.out.println(checkSeason(67, true));
		System.out.println(checkSeason(71, false));
	}
	
	public static boolean checkSeason(int temp, boolean isSummer) {
		if (isSummer) {
			if (60 >= temp && temp <= 100)
				return true;
			else if (60 >= temp && temp <= 90)
				return true;			
		}
		return false;
	}
}