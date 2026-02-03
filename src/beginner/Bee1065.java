package beginner;

import java.util.Scanner;

public class Bee1065 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = 0;
		int count = 0;

		for (int i = 0; i < 5; i++) {
			number = scanner.nextInt();
			count += (number % 2 == 0) ? 1 : 0;
		}

		System.out.printf("%d valores pares%n", count);

		scanner.close();
	}

}
