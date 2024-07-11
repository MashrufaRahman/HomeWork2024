package hw14Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {
	public void maths() {
		System.out.println("the non-abstract or implemented method.");
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("This aeronauticalInfo method from AeronauticalSchool interface");
		
	}

	@Override
	public void mechanicalLab() {
		System.out.println("This mechanicalLab method from EngineeringSchool class");
		
	}

}
