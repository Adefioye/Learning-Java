
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Car myCar = new Car();
//		
//		System.out.println(myCar.color);
//		System.out.println(myCar.make);
//		System.out.println(myCar.year);
//		
//		myCar.drive();
//		myCar.brake();
		
		// Testing class constructor
//		
//		Human human1 = new Human("samuel", 25, 50.0);
//		Human human2 = new Human("salamatu", 47, 56.7);
//		
//		System.out.println(human1.age);
//		System.out.println(human2.weight);
//		
//		human1.eat();
//		human2.drink();
		
		
		// TESTING OVERLOADED CONSTRUCTORS
//		Pizza pizza = new Pizza();
//		Pizza pizza = new Pizza("thick crust");
//		Pizza pizza = new Pizza("thick crust", "tomato");
//		Pizza pizza = new Pizza("thick crust", "tomato", "micarati");
//		Pizza pizza = new Pizza("thick crust", "tomato", "micarati", "simunta");
//		
//		
//		System.out.println(pizza.bread);		
//		System.out.println(pizza.sauce);
//		System.out.println(pizza.cheese);
//		System.out.println(pizza.topping);
		
		// Testing toString method using OVERRIDING
//		Car car1 = new Car();
		
		// Explicit usage of toString method
//		System.out.println(car1.toString());
		
		// Implicit usage of toString method
//		System.out.println(car1);
		
		// Object passing
		
//		Car car1 = new Car("BMW");
//		Car car2 = new Car("Tesla");
//		
//		Garage garage = new Garage();
//		
//		garage.park(car1);
//		garage.park(car2);
		
		// Testing static variable and method
		Friend friend1 = new Friend("MB");
		Friend friend2 = new Friend("Ella");
		Friend friend3 = new Friend("BJ");
		Friend friend4 = new Friend("Mike");
		
		
		System.out.println(Friend.numOfFriends);
		
		Friend.displayFriends();
		
		

	}

}
