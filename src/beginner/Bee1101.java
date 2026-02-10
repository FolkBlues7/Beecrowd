package beginner;

import java.util.Scanner;

public class Bee1101 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			if (a <= 0 || b <= 0) {
				break;
			}

			int min = Math.min(a, b);
			int max = Math.max(a, b);
			int sum = 0;

			for (int i = min; i <= max; i++) {
				sum += i;
				System.out.print(i + " ");
			}
			System.out.println("Sum=" + sum);
		}

		scanner.close();
	}

}
