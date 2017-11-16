
public class Person {
	private int age;
	private String name;
	private String occupation;
		
	public Person(int age, String name, String occupation) {
		super();
		this.age = age;
		this.name = name;
		this.occupation = occupation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public String toString() {
		return "Name: " + this.name + " Age: " + this.age + " Occupation: " +this.occupation;
	}	

}
