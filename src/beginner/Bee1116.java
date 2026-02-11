package beginner;

import java.util.Scanner;

public class Bee1116 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {

			int x = scanner.nextInt();
			int y = scanner.nextInt();

			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.printf("%.1f%n", (double) x / y);
			}

		}

		scanner.close();

	}

}
