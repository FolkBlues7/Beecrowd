package beginner;

import java.util.Scanner;

public class Bee1113 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = 0;
		int b = 0;

		while (true) {

			a = scanner.nextInt();
			b = scanner.nextInt();

			if (a == b) {
				break;
			}

			if (b > a) {
				System.out.println("Crescente");
			} else {
				System.out.println("Decrescente");
			}

		}

		scanner.close();

	}

}
