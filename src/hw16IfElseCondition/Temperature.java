package hw16IfElseCondition;
import java.util.Scanner;
public class Temperature {
	public static void main(String[] args) {
		System.out.println("Today's Weather");
		Scanner scanner = new Scanner(System.in); // Scanner class instantiate
		int temparature = scanner.nextInt();
		System.out.println("todays Temperature:" + temparature);
		scanner.close();
		int temp1 = 32;
		int temp2 = 55;
		int temp3 = 73;
		int temp4 = 101;
		if (temp1 < 32) {
			System.out.println("Freezing" + temp1);
		} else if (temp2 < 55) {
			System.out.println("Pleasant" + temp2);
		} else if (temp3 < 73) {
			System.out.println("Getting Warmer" + temp3);

		} else if (temp4 > 101) {
			System.err.println("Very Hot" + temp4);
		} else {
			System.out.println("Please put a valid temperature");
			scanner.close();
		}
		{

		}

	}

}
