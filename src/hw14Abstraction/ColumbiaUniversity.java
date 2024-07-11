package hw14Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	// We can't create a abstract method in the regular class. It has to be a
	// abstract class to create a abstract method.
	// Abstract method is not allowed in regular class.
	// public abstract void chemistry();
	public void biology() {
		System.out.println("I am  the non-abstract or implemented method.");
	}

	// Yes we can create a default constructor inside the regular class.
	public ColumbiaUniversity() {

	}

	@Override
	public void commonRoom() {
		System.out.println("This is commonRoom method from college interface");

	}

	@Override
	public void laboratory() {
		System.out.println("This is laboratory method from college interface");

	}

	@Override
	public void languageClub() {
		System.out.println("This is languageClub method from college interface");

	}

	@Override
	public void emergencyRoom() {
		System.out.println("This is emergencyRoom method from Hospital interface");

	}

	@Override
	public void surgeryRoom() {
		System.out.println("This is surgeryRoom method from Hospital interface");

	}

	@Override
	public void cafeteria() {
		System.out.println("This is cafereria method from Hospital interface");

	}

	@Override
	public void vocationalInfo() {
		System.out.println("This is vocationalInfo method from vocationalSchool interface");

	}

	@Override
	public void classSize() {
		System.out.println("This is classSize method from University interface");

	}

	@Override
	public void playGround() {
		System.out.println("This is playGround method from University interface");

	}

	@Override
	public void teacher() {
		System.out.println("This is teacher method from University interface");

	}

	@Override
	public void anatomyLab() {
		System.out.println("This is anatomyLab method from MedicalSchool class");

	}

	@Override
	public void lawInfo() {
		System.out.println("This is lawInfo method from LawSchool interface");

	}

	@Override
	public void hygiene() {
		System.out.println("This is hygiene method from NursingSchool class");

	}

}
