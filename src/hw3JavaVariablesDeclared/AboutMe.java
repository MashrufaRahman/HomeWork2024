package hw3JavaVariablesDeclared;
/*
Step 3: Declare byte, short, long, and double type variables too inside the class. Choose the variable name as your own to describe yourself.

Step 4: Inside the void type of method "aboutMe" body, also add byte, short, long, and double type variables too inside syso. (you can use String concatenation to make it a more meaningful outcome).

Step 5: Use \n to create new line inside the String of syso

Step 6: Create another class AboutMeTest. Inside "AboutMeTest" Class, Instantiate AboutMe class inside the main method. Initialize all the variables and call the method by the object. I expect print outcome for 2 people, one for you and another for your best friend Alex.

Step 7: Give a single line comment where a variable is declared and initialized, the constructor is declared and initialized, and the method is implemented and initialized.

Step 8: Follow indentation by Organizing the code. Copy the code and paste it below.
 */

//Class declared
public class AboutMe {

//variable declared
	String sunFlower;
	public String myName;
	public int myAge;
	public char mygender;
	public boolean usCitizen;
	public float myHight;
	public Short phonebill;
	public long bankAccount;
	public byte rollNumber;
	public double grade;
	

//Constructor declared
	public AboutMe() {
		System.out.println("This is all about me");
	}

//Method declared
	public void aboutMe() {
		System.out.println("\nMy name is-" + myName + "\nMy age is-" + myAge + "\nMy gender is-" + mygender
				+ "\nAm I usCitizen ?-" + usCitizen + "\nMy hight is-" + myHight+"\nMy phone bill is-"+phonebill+"\nMy bank account number is-"+bankAccount+"\nMy roll number is-"+rollNumber+"\nMy grade is-"+grade);
	} //call all the variables inside the method

	public static void main(String[] args) {
		AboutMe tony = new AboutMe(); // Instantiate AboutMe class and Object created
		tony.aboutMe(); // Object call only aboutMe()
			}

}

