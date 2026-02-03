package beginner;

import java.util.Scanner;

public class Bee1067 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int counter = scanner.nextInt();

		for (int i = 1; i <= counter; i += 2) {
			System.out.println(i);
		}

		scanner.close();
	}

}
