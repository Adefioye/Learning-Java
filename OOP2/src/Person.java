
public class Person {
	
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return String.format("%s \n %d \n", this.name, this.age);
	}
}
