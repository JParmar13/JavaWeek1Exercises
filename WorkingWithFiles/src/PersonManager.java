import java.util.ArrayList;

public class PersonManager {
	
	ArrayList<People> personListing = new ArrayList<People>();
	
	ArrayList<String> newList = new ArrayList<String>();

	ArrayList<String> secondNewList = new ArrayList<String>();

	public void addPerson(People people)
	{
		personListing.add(people);
	}
		
}


