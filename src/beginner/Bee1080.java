package beginner;

import java.util.Scanner;

public class Bee1080 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int biggest = -1;
		int index = -1;

		for (int i = 1; i <= 100; i++) {
			int n = scanner.nextInt();

			if (n > biggest) {
				biggest = n;
				index = i;
			}

		}

		System.out.printf("%d%n%d%n", biggest, index);

		scanner.close();

	}
}
