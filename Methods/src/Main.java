
public class Main {

	public static void main(String[] args) {
		
		
		// METHOD: A block of code that is executed when invoked.
//		String name = "Shola";
//		int age = 20;
//		hello(name, age);
//		
//		int x = 9;
//		int y = 10;
//		
//		int res = add(x, y);
//		
//		System.out.println(res);
		
		/*
		 * 	OVERLOADED METHOD: This is applicable for methods with same name but different parameters
		 * 						Method signature = method name + method parameters
		 * 
		 * */
		
//		int res = add(2);
//		int res = add(1, 2);
//		int res = add(1, 2, 3);
//		double res = add(2.0);
//		double res = add(1.0, 2.0);
		double res = add(1.0, 2.0, 3.0);
		
		System.out.println(res);

	}
//	
//	static void hello(String name, int age) {
//		
//		String result = String.format("%s is %s year's old", name, age);
//		System.out.println(result);
//	}
//	
//	static int add(int x, int y) {
//		return x + y;
//	}

	static int add(int a) {
		System.out.println("Overloaded method #1");
		return a;
	}
	
	static int add(int a, int b) {
		System.out.println("Overloaded method #2");
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("Overloaded method #3");
		return a + b + c;
	}
	
	static double add(double a) {
		System.out.println("Overloaded method #4");
		return a;
	}
	
	static double add(double a, double b) {
		System.out.println("Overloaded method #5");
		return a + b;
	}
	
	static double add(double a, double b, double c) {
		System.out.println("Overloaded method #6");
		return a + b + c;
	}
	
	
	

}
