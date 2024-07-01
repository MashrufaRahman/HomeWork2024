package hw9Abstraction;
//Interface inherit more than one Interfaces using extends keyword. A regular class can inherit one regular class or abstract class by extend

public interface University extends College, Hospital {
	public void classSize();

	public void playGround();

	public void teacher();
// No, inside the interface you can't create a constructor 
//public University() {}

	public void gymnasium();

	public static void library() {

	}
	/*
	 * One keyword by "extend" is use for the inheritance in Interface An abstract
	 * class can inherit one abstract or regular class using "extends" keyword. No
	 * abstract class can't inherit another class or abstract class or interface by
	 * extends keyword only one inheritance are possible in the abstract class by
	 * using extends keyword.
	 */
}
