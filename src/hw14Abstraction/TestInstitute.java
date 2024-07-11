package hw14Abstraction;

public class TestInstitute {
//ColumbiaUniversity
	public static void main(String[] args) {
	ColumbiaUniversity cu = new ColumbiaUniversity();
	cu.biology();
cu.commonRoom();
	cu.laboratory();
	cu.languageClub();
	cu.emergencyRoom();
	cu.surgeryRoom();
	cu.cafeteria();
	cu.vocationalInfo();
	cu.classSize();
	cu.playGround();
	cu.teacher();
	cu.anatomyLab();
	cu.lawInfo();
	cu.hygiene();
	// Interface cannot instantiate itself. It needs help from the concrete class to create an object.
	// when a regular class extends one regular or abstract class and implements multiple interface that class become concrete class.
		
	System.out.println("\n-----MedicalSchool-----");
	MedicalSchool ms = new ColumbiaUniversity();
	ms.anatomyLab();
	ms.biochemistryLab();
	
	System.out.println("\n------- University class instantiate-----");
	University university = new ColumbiaUniversity();
	university.classSize();
	university.playGround();
	university.teacher();
	
	System.out.println("\n------- VocationalSchool class instantiate-----");
	VocationalSchool vs = new ColumbiaUniversity();
	vs.vocationalInfo();
	
	
	
	
		

	}

}
