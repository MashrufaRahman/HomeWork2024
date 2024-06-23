package hw8UseOfLoop;

public class HW_Java_Control_Statement {
	public static void main(String[] args) {
		System.out.println("----------for loop----------");
		for (int i = -20; i <= 50; i +=1) {
			if (i % 2 == 0) {
				continue;//Skip
			}
			System.out.println("Odd Numbers:"+i);

		}

	}

}
