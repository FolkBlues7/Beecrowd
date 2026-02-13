package beginner;

import java.util.Scanner;

public class Bee1146 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			int n = scanner.nextInt();

			if (n == 0) {
				break;
			}

			StringBuilder result = new StringBuilder();

			result.append(1);
			for (int i = 2; i <= n; i++) {
				result.append(" ").append(i);
			}
			result.append("\n");

			System.out.print(result);
		}

		scanner.close();

	}

}
