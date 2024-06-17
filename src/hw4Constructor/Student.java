package hw4Constructor;
/*
 * HW_QA_Java_Constructor:

Step 1: Create a package name "hw4Constructor" in your Home Work project.

Step 2: Inside the package, Create a class "Student". Declare some variable -- stName, stID, Gender, isProgrammer(as boolean), grade (as float).
Step 3: Declare the default constructor.
Step 4: Decare only one parameterized constructor (hints: source -- generate constructor using fields-). Use only one System.out.println() in the parameterized constructor for a meaningful outcome to declare the above variables.
Step 5: Create another class StudentTest. Create object as many as you want under the main method. Initialize constructors.
Step 6: My expectation is to see in the console as --> This is all about Student.
Step 7: In the next line, The second outcome -- > Student Name:<Your Name> , ID: <YourId>, Gender:<Your Gender> , Grade: <Any Grade> and Java Programmer? Ans: true.
Step 8: The above line is a comma separated outcome
Step 9: Organize the code. Push in the GitHub. Paste your GitHub link below.
 */
public class Student {
	public String stName;
	public int stID;
	public char Gender;
	public boolean isProgrammer;
	public float grade;

	// Default constructor declared/defined
	public Student() {
		System.out.println("I am a constructor from Student");
	}
	// parameterized constructor declared/defined---1
	public Student(String stName, int stID, char gender, float grade, boolean isProgrammer) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.Gender = gender;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("\nStudent Name- " + stName + "\nStudent ID- " + stID + "\nGender- " + Gender
				+ "\nStudent is Programmer- " + isProgrammer + "\ngrade- " + grade);
	}

//parameterized constructor ----2
	public Student(String stName, int stID, char gender, boolean isProgrammer, float grade) {
		super();
		this.stName = stName;
		this.stID = stID;
		Gender = gender;
		this.grade = grade;
		this.isProgrammer = isProgrammer;

		System.out.println("\nStudent Name- " + stName + "\nStudent ID- " + stID + "\nGender- " + Gender + "\ngrade- "
				+ grade + "\nStudent is Programmer- " + isProgrammer);
	}

}
