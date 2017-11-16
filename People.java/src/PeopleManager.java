import java.util.ArrayList;

public class PeopleManager {
	
	 ArrayList<People> peopleListing = new ArrayList<People>();

	public String search(String name) {
		for (People people : peopleListing) {
			if (people.name.equals(name)) {
				return (name + " : This user has been found");
			}
		}
		return name;
		
	}
}