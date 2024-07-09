package hw13Polymorphism;

public class Sister {

	// No you cannot create a same name method more than one but if you want to
	// create a same method name than the parameter has to be different.
    //void type method
	public void sister() {
		System.out.println("I am a void type method");

	}

	// Parameterized type method
	public void sister(int age1) {
		int total = age1;
		System.out.println("The age is:" + total);

	}

	// Parameterized type method2
	public void sister(int age1, int age2) {
		int total1 = age1 + age2;
		System.out.println("The age is:" + total1);

	}

	// Return type method
	public int sister(int age1, int age2, int age3) {
		int total2 = age1 + age2 + age3;
		System.out.println("The age is:" + total2);
		return 0;
	}

//void type static method
	public static void sister(String age4) {
		String name = "age4";
		System.out.println("The name is:" + age4);

	}
	// Return type final method

	public final int sister(int age1, int age2, int age3, int age7) {
		int total3 = age1 + age2 + age3 + age7;

		System.out.println("The total age is:" + total3);
		return 0;

	}
	/*
	 * For method overloading Method overloading can be void type or return type
	 * parameterized or non parameterized Count the numbers of the parameter If same
	 * then see the sequence of the data type of the parameter.
	 */

	public static void main(String[] args) {

	}
}
