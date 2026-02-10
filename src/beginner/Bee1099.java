package beginner;

import java.util.Scanner;

public class Bee1099 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int set = scanner.nextInt();

		for (int i = 0; i < set; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			int max = Math.max(a, b);
			int min = Math.min(a, b);

			int sum = 0;

			for (int j = min + 1; j < max; j++) {
				if (j % 2 != 0) {
					sum += j;
				}
			}

			System.out.printf("%d%n", sum);
		}

		scanner.close();

	}

}
