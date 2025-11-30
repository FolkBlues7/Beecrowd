package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1021 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int notes[] = { 10000, 5000, 2000, 1000, 500, 200 };
		int coins[] = { 100, 50, 25, 10, 5, 1 };

		double input = scanner.nextDouble();
		int money = (int) (input * 100 + 0.5); // transform to cents

		System.out.println("NOTAS:");

		for (int i : notes) {
			int aux = money / i;
			System.out.printf("%d nota(s) de R$ %.2f%n", aux, i / 100.0);
			money %= i;
		}

		System.out.println("MOEDAS:");

		for (int i : coins) {
			int aux = money / i;
			System.out.printf("%d moeda(s) de R$ %.2f%n", aux, i / 100.0);
			money %= i;
		}

		scanner.close();
	}

}
