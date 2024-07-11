package hw14Abstraction;

import hw9Abstraction.LawSchool;
import hw9Abstraction.NursingSchool;

public abstract class MedicalSchool extends NursingSchool implements LawSchool{
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
