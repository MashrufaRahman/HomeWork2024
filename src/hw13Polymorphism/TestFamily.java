package hw13Polymorphism;



public class TestFamily {
	//public static String name = "age4";
	public static void main(String[] args) {
		Sister sis = new Sister();
		sis.sister(); //void method call
		sis.sister(10); //parameterized method call
		sis.sister(10, 20); //parameterized method2 call
		sis.sister(10, 20, 30); //Return type method
		Sister.sister("Alex"); //void type static method
		sis.sister(10, 20, 30, 40); //Return type final method
		
		System.out.println("\n ----This is Niece class---");
		Niece nc = new Niece();
		nc.sister(); //void method call
		nc.sister(10); //parameterized method call
		nc.sister(10, 20); //parameterized method2 call
		nc.sister(10, 20, 30); //Return type method
		
	}

}
