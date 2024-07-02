package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		// super() method can call default and parameterized constructor one at a time.
		// super(); //default method
		super("Toma", 25, 'F', false); // parameterized method
		System.out.println("\n---I am a default constructor");
	}

// Super keyword used to call the method from parent/super class
	public Daughter(String birthMonth, int age) {
		super.father(); // void type method call/initialized by super class
		super.fatherInfo("Lisa", 25, 'F', false); // parameterized method call/initialized by super class
		// super keyword is also use to call (initialize)the variable of super class
		super.familyName = "Rahman";
		System.out.println("\nThe family name is:" + familyName);

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("\n---I am a parameterized constructor");
	}

	// void type method
	public void daughter() {
		System.out.println("\n I am a void type method");
	}

	// parameterized type method
	public void daughterInfo(String birthMonth, int age) {

		System.out.println("My birth month is:" + birthMonth + "My age is:" + age);
	}
}
