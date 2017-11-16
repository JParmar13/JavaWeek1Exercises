import java.util.ArrayList;

public class PeopleManager {
	private ArrayList<Person> personList = new ArrayList<Person>();

	public void addPerson(Person p) {
		personList.add(p);
	}

	public Person findPerson(String nameToFind) {
		Person p = null;
		for (Person currentPerson : personList) {
			if (currentPerson.getName().equals(nameToFind)) {
				p = currentPerson;
			}
		}
		return p;
	}

}
