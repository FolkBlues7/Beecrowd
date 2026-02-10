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
			int min = Math.min(a, b) + 1;

			int sum = 0;

			if (min % 2 == 0) {
				min++;
			}

			for (int j = min; j < max; j += 2) {

				sum += j;

			}

			System.out.printf("%d%n", sum);
		}

		scanner.close();

	}

}
