package beginner;

import java.util.Scanner;

public class Bee1134 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int countAlcohol = 0;
		int countGasoline = 0;
		int countDiesel = 0;

		while (true) {

			int n = scanner.nextInt();

			if (n == 4) {
				break;
			}

			if (n == 1) {
				countAlcohol++;
			} else if (n == 2) {
				countGasoline++;
			} else if (n == 3) {
				countDiesel++;
			}

		}

		System.out.println("MUITO OBRIGADO");

		System.out.printf("Alcool: %d%n", countAlcohol);
		System.out.printf("Gasolina: %d%n", countGasoline);
		System.out.printf("Diesel: %d%n", countDiesel);

		scanner.close();

	}

}
