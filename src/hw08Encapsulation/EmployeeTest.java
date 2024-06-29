package hw08Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Shapla Rahman");
		employee.setAge(30);
		employee.setSex('F');
		employee.setCitizen(false);
		System.out.println("Employee name:" + employee.getName() + "\nEmployee age:" + employee.getAge()
				+ "\nEmployee sex:" + employee.getSex() + "\nIs the employee is citizen?" + employee.isCitizen());
	}

}
