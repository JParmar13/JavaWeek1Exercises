import java.util.ArrayList;

public class PersonExerciseRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeopleManager pm = new PeopleManager();
		Person p = new Person(10, "Jeff", "dogsitter");
		Person p2 = new Person(20, "Bob", "dogsitter");
		Person p3 = new Person(50, "Dave", "catsitter");
		pm.addPerson(p);
		pm.addPerson(p2);
		pm.addPerson(p3);
		Person foundPerson = pm.findPerson("Jeff");
		System.out.println(foundPerson);
	

	}

}
