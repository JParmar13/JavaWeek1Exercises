public class People {

	String name;
	int age;
	String jobTitle;

	public People(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public People() {

	}

	public String toString() {
		return "Name is" + name + " , I am aged " + age + " , my profession is :" + jobTitle;
	}
}