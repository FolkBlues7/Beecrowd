package beginner;

import java.util.Scanner;

public class Bee1117 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double x = 0;
		double y = 0;

		while (true) {
			x = scanner.nextDouble();
			if (x >= 0 && x <= 10) {
				break;
			}
			System.out.println("nota invalida");
		}

		while (true) {
			y = scanner.nextDouble();
			if (y >= 0 && y <= 10) {
				break;
			}
			System.out.println("nota invalida");
		}

		double average = (x + y) / 2.0;

		System.out.printf("media = %.2f%n", average);

		scanner.close();
	}

}
