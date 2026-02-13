package beginner;

import java.util.Scanner;

public class Bee1145 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		StringBuilder result = new StringBuilder();

		for (int i = 1; i < b - 1; i += a) {
			result.append(i);
			for (int j = 1; j < a; j++) {
				result.append(" ").append(i + j);
			}
			result.append("\n");
		}
		System.out.print(result);

		scanner.close();

	}

}
