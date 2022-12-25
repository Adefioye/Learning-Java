
public class Main {

	public static void main(String[] args) {
		
		// Testing encapsulation and copy method using Car class 
//		Car car1 = new Car("Tesla", "Model X", 2002);
		
//		Car car2 = new Car();
//		car2.copy(car1); // using the copy method
		
//		Car car2 = new Car(car1); // Using copy constructor
		
		
	
//		car1.setModel("Model Y");
		
//		System.out.println(car1);
//		System.out.println(car1.getMake());
//		System.out.println(car1.getModel());
//		System.out.println(car1.getYear());
//		System.out.println();
//		
//		System.out.println(car2);
//		System.out.println(car2.getMake());
//		System.out.println(car2.getModel());
//		System.out.println(car2.getYear());
//		

		// Testing interfaces using Rabbit, Hawk and Fish Class
		
		// Testing flee method in Prey interface
//		Rabbit rabbit = new Rabbit();
//		
//		rabbit.flee();
		
		// Testing hunt method in Predator interface
//		Hawk hawk = new Hawk();
//		
//		hawk.hunt();
		
		// Testing flee and hunt methods in Prey and Predator interfaces added to Fish class
		Fish fish = new Fish();
		
		fish.flee();
		fish.hunt();
		
	}

}
