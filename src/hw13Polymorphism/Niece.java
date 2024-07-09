package hw13Polymorphism;

public class Niece extends Sister {
	// child class can override the method of parent class
	// void type method is implemented
	@Override
	public void sister() {
		System.out.println("I am a void method from Niece class");
		System.out.println("This is new method for Niece class");

		
	}

	// Parameterized type method
	// method name and parameterized will be no change only body of the method we
	// can change.
	@Override
	public void sister(int age1) {
		int total = age1 + 30;
		System.out.println("The age is:" + total);

	}

	// Parameterized type method2
	@Override
	public void sister(int age1, int age2) {
		int total1 = age1 + age2 + 200;
		System.out.println("The age is:" + total1);

	}

	// Return type parameterized method
	@Override
	public int sister(int age1, int age2, int age3) {
		int total2 = age1 + age2 / 3 + age3 + 300;
		System.out.println("The age is:" + total2);
		return 0;
	}

	// void type static method
	// static method cannot be override
	/*
	 * @Override public static void sister(String age4) { String name = "age4";
	 * System.out.println("The name is:" + age4);
	 * 
	 * }
	 * 
	 * // Return type final method //final method cannot be override
	 * 
	 * @Override public final int sister(int age1, int age2, int age3, int age7) {
	 * int total3 = age1 + age2 + age3 + age7;
	 * 
	 * System.out.println("The total age is:" + total3); return 0;
	 * 
	 * }
	 */
}
