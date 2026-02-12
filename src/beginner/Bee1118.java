package beginner;

import java.util.Scanner;

public class Bee1118 {

	public static double valid(Scanner scanner) {

		boolean status = false;
		double number = 0;

		while (status == false) {

			number = scanner.nextDouble();

			if (number >= 0.0 && number <= 10.0) {
				status = true;
			} else {
				System.out.println("nota invalida");
			}

		}
		return number;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			double n1 = valid(scanner);
			double n2 = valid(scanner);

			double average = (n1 + n2) / 2;

			System.out.printf("media = %.2f%n", average);

			int n = 0;

			while (n != 1 && n != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				n = scanner.nextInt();
			}

			if (n == 2) {
				break;
			}

		}
	}

}
