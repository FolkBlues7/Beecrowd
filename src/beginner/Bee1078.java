package beginner;

import java.util.Scanner;

public class Bee1078 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int n = scanner.nextInt();
		StringBuilder result = new StringBuilder();

		for (int i = 1; i <= 10; i++) {
			result.append(i + " x ").append(n + " = ").append(n * i).append("\n");
		}
		System.out.print(result);

		scanner.close();

	}

}
