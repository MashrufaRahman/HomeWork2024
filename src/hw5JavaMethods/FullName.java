package hw5JavaMethods;

public class FullName {
	public String fullName(String fName, String lName) {
		System.out.println("Family Member: " + fName + " " + lName);
		return "fullName";
	}

	public static void main(String[] args) {
		FullName fn = new FullName();
		fn.fullName("Luna", "Rahman");
		fn.fullName("Rina", "Rahman");
		fn.fullName("Murad", "Rahman");

	}

}


