package beginner;

import java.util.Scanner;

public class Bee1101 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		do {
			int min = Math.min(a, b);
			int max = Math.max(a, b);

			int sum = 0;

			for (int i = min; i <= max; i++) {
				sum += i;
				System.out.printf("%d ", i);
			}
			System.out.printf("Sum=%d%n", sum);

			a = scanner.nextInt();
			b = scanner.nextInt();

		} while (a > 1 && b > 1);

		scanner.close();

	}

}
