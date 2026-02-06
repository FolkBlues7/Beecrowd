package beginner;

import java.util.Scanner;

public class Bee1074 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int n = scanner.nextInt();
		int input = 0;
		StringBuilder result = new StringBuilder(); // maximum size possible

		for (int i = 0; i < n; i++) {

			input = scanner.nextInt();

			if (input == 0) {
				System.out.println("NULL");
				continue;
			} else if (input % 2 == 0) {
				result.append("EVEN");
			} else {
				result.append("ODD");
			}

			result.append(" ");

			if (input > 0) {
				result.append("POSITIVE");
			} else {
				result.append("NEGATIVE");
			}

			System.out.println(result);
			result.setLength(0);
		}

		scanner.close();

	}

}
