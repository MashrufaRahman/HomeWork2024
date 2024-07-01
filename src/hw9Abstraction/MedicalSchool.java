package hw9Abstraction;

import hw7Abstraction.NursingSchool;
/*
 * An abstract class can inherit only one abstract class or one regular class by extends key word
// An abstract class can't inherit an Interface by extends key word
 * An abstract class can inherit only one class or one abstract class
 */
public abstract class MedicalSchool extends NursingSchool{
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
