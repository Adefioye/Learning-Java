
public class Fish implements Prey, Predator{

	public void flee() {
		System.out.println("The fish is fleeing from a larger fish");
	}
	
	public void hunt() {
		System.out.println("The fish is hunting a smaller fish");
	}
}
