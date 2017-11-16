
public class PeopleExercise extends People {
	
		
	public static void main(String[] args) {
		
		PeopleManager pManager = new PeopleManager();
		
				
		People jay = new People("Jay", 23, "Trainee");
		People mega = new People("Mega", 97, "Wizard");
		
		pManager.peopleListing.add(jay);
		pManager.peopleListing.add(mega);
		
		for (People people : pManager.peopleListing) {
			System.out.println(people);
		}
		
		System.out.println(pManager.search("Mega"));
		
	}
	
	
	}
	
	
	
	
	
	
