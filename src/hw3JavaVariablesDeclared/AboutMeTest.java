package hw3JavaVariablesDeclared;

/*
 Step 6: Create another class AboutMeTest. Inside "AboutMeTest" Class, Instantiate AboutMe class inside the main method. Initialize all the variables and call the method by the object. I expect print outcome for 2 people, one for you and another for your best friend Alex.

Step 7: Give a single line comment where a variable is declared and initialized, the constructor is declared and initialized, and the method is implemented and initialized.

Step 8: Follow indentation by Organizing the code. Copy the code and paste it below.
 */
public class AboutMeTest {
	public String myName; // all Variables is initialize.
	public int myAge;
	public char mygender;
	public boolean usCitizen;
	public float myHight;
	public Short phonebill;
	public long bankAccount;
	public byte rollNumber;
	public double grade;
	
	
	//Method declared
		public void aboutMe() {
			System.out.println("\nMy name is-" + myName + "\nMy age is-" + myAge + "\nMy gender is-" + mygender+ "\nAm I usCitizen ?-" + usCitizen + "\nMy hight is-" + myHight+"\nMy phone bill is-"+phonebill+"\nMy bank account number is-"+bankAccount+"\nMy roll number is-"+rollNumber+"\nMy grade is-"+grade);}

	public static void main(String[] args) {
		AboutMeTest koli = new AboutMeTest();
		koli.myName = "Koli";
		koli.myAge = 25;
		koli.mygender = 'F';
		koli.usCitizen = true;
		koli.myHight = 5.3f;
		koli.phonebill = 200;
		koli.bankAccount = 1237552134;
		koli.rollNumber = 23;
		koli.grade = 4.0;
		koli.aboutMe();  // method called
		
		AboutMeTest Alex = new AboutMeTest();
		Alex.myName = "Alex";
		Alex.myAge = 25;
		Alex.mygender = 'F';
		Alex.usCitizen = true;
		Alex.myHight = 5.3f;
		Alex.phonebill = 400;
		Alex.bankAccount = 88888;
		Alex.rollNumber = 23;
		Alex.grade = 4.0;
		Alex.aboutMe();  // method called
		System.out.println();
		
		

	}

}
