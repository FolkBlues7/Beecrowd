package beginner;

import java.util.Scanner;

public class Bee1073 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		for (int i = 2; i <= n; i += 2) {
			System.out.printf("%d^2 = %.0f%n", i, Math.pow(i, 2));
		}

		scanner.close();

	}

}
