
public class People {
	
	private String name;
	private int age;
	private String occupation;
	
	
	public People(String name, int age, String occupation) {
		super();
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	
	public People() {
		
	}	
	
	public String toString() {
		return name + "," + age + ","  +occupation + ",";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
}