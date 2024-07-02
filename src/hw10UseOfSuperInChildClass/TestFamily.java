package hw10UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {
		Father father = new Father();
		System.out.println("\n----default constructor initialized from Father class");
		System.out.println("\n----parameterized constructor initialized from Father class");
		Father father2 = new Father("Poli", 25, 'F', true);
		System.out.println("\n---void type method initialized ");
		father2.father();
		System.out.println("\n---Parameterized method initialized");
		father2.fatherInfo("Koli", 30, 'F', false);
		Daughter daughter = new Daughter();
		System.out.println("default constructor initilized");
		Daughter daughter2 = new Daughter("March", 22);
		System.out.println("---parameterized constructor initialized");
		daughter2.daughter();
		daughter2.daughterInfo("April", 25);

	}

}
