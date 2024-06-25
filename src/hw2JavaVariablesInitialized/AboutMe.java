package hw2JavaVariablesInitialized;

//Class declared
public class AboutMe {
//variable declared
	String FirstName;
//Variable initialized
	public String myName = "Shapla";
	public int myAge = 25;
	public char mygender = 'F';
	public boolean fullTimeStudent = true;
	public float myHight = 5.3f;

//Constructor declared
	public AboutMe() {
		System.out.println("This is all about me");
	}

//Method declared
	public void aboutMe() {
		System.out.println("\nMy name is:" + myName + "\nMy age is:" + myAge + "\nMy gender is:" + mygender
				+ "\nAm I full time student?:" + fullTimeStudent + "\nMy hight is:" + myHight);
	} // call all the variables inside the method

	public static void main(String[] args) {
		AboutMe tony = new AboutMe(); // Instantiate AboutMe class and Object created
		tony.aboutMe(); // Object call only aboutMe()
	}

}
