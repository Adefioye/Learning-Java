
public class Friend {

	String name;
	static int numOfFriends;
	
	Friend(String name) {
		this.name = name;
		numOfFriends++;
	}
	
	static void displayFriends() {
		System.out.println(String.format("You have %d friends", numOfFriends));
	}
}
