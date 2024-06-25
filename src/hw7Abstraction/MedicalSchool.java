package hw7Abstraction;

public abstract class MedicalSchool {
//Abstract method
	public abstract void anatomyLab();

//Non abstract method		
	public void biochemistryLab() {
		System.out.println("I am a non abstract method");
	}

//Below I am a default constructor
	public MedicalSchool() {

	}

}
