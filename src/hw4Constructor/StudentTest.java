package hw4Constructor;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println("------This is all about Student-----");
		Student koli = new Student("Koli R", 565231, 'F', false, 4);
		System.out.println("-----This is all about student-----");
		Student mashrufa = new Student("Mashrufa Rahman", 523654, 'F', 5, true);
	}

}
