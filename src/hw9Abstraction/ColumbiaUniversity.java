package hw9Abstraction;

public class ColumbiaUniversity {
	// We can't create a abstract method in the regular class. It has to be a
	// abstract class to create a abstract method.
	// public abstract void chemistry();
	public void biology() {
		System.out.println("I am  the non-abstract or implemented method.");
	}

	// Yes we can create a default constructor in side the regular class.
	public ColumbiaUniversity() {

	}
	/*
	 * ColumbiaUniversity cannot extends MedicalSchool because MedicalSchool is a
	 * abstract class. one keyword extends use for the regular class to inheritance.
	 * 
	 */

}
