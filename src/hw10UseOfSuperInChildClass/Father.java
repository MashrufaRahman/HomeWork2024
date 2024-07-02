package hw10UseOfSuperInChildClass;

//Name, age, sex, usCitizen, and FamilyName.
public class Father {

	public String Name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	// default constructor
	public Father() {
		System.out.println("I am a default constructor");
	}

	// parameterized constructor.
	public Father(String name, int age, char sex, boolean usCitizen) {
		super();
		Name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("I am a parameterize constructor");
		System.out.println("\nMy name is:" + name + "\nMy age is:" + age + "\nMy gender is:" + sex + "\nAm I usCitizen"
				+ usCitizen);
	}

	// void type method or non parameterized or no returned type method.
	public void father() {

		System.out.println("I am a void type method");
	}

	// parameterized method
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		System.out.println("I am a parameterized method");
		System.out.println("\nMy name is:" + name + "\nMy age is:" + age + "\nMy gender is:" + sex + "\nAm I usCitizen"
				+ usCitizen);

	}

}
