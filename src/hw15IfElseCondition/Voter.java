package hw15IfElseCondition;
public class Voter {
	public static void main(String[] args) {

		int age1 = 18;
		int age2 = 40;
		if (age1 == age2) {
			System.out.println("I am a voter");
		} else if (age1 < age2) {
			System.out.println("I am not a Voter");

		} else if (age1 > age2) {
			System.out.println("I am a Voter from age 18");
		} else {
			System.out.println("Please add a valid age");
		}

	}

}
