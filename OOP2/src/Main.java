
public class Main {

	public static void main(String[] args) {
		
		// Testing Inheritance using Vehicle, Car and Bicycle class
		
//		Car car = new Car();
//		Bicycle bike = new Bicycle();
		
//		System.out.println(car.speed);
//		System.out.println(bike.speed);
//		
//		car.go();
//		bike.stop();
//		
//		System.out.println(car.doors);
//		System.out.println(bike.wheels);
//		System.out.println(bike.pedals);
		
		// Testing SUPER keyword using Person and Hero Class
//		Hero superMan = new Hero("Superman", 65, "Everything");
		
//		System.out.println(superMan.name);
//		System.out.println(superMan.age);
//		System.out.println(superMan.power);
//		
//		System.out.println(superMan);
		
		// ABSTRACT CLASSES
		/*
		 * 	Abstract class = Abstract class cannot be instantiated but they can have a subclass.
		 * 						Abstract methods are declared without implementation.
		 * 
		 * */
		
//		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		
		car.go();
		car.stop();
	}

}
