package beginner;

import java.util.Scanner;

public class Bee1071 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int cont = 0;

		for (int i = b + 1; i < a; i++) {
			if (!(i % 2 == 0)) {
				cont += i;
			}
		}

		System.out.printf("%d%n", cont);

		scanner.close();

	}

}
