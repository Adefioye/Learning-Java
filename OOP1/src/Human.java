

// Declaring constructors
public class Human {

	String name;
	int age;
	double weight;
	
	Human(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(String.format("%s is eating", this.name));
	}
	
	void drink() {
		System.out.println(String.format("%s is drinking", this.name));
	}
}
